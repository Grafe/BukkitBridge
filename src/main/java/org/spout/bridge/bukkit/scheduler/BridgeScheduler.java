/*
 * This file is part of BukkitBridge.
 *
 * Copyright (c) 2012, VanillaDev <http://www.spout.org/>
 * BukkitBridge is licensed under the GNU General Public License.
 *
 * BukkitBridge is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * BukkitBridge is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.spout.bridge.bukkit.scheduler;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitScheduler;
import org.bukkit.scheduler.BukkitTask;
import org.bukkit.scheduler.BukkitWorker;

import org.spout.api.Spout;
import org.spout.api.scheduler.TaskPriority;

public class BridgeScheduler implements BukkitScheduler {
	@Override
	public <T> Future<T> callSyncMethod(Plugin plugin, Callable<T> task) {
		FutureRunnable<T> futureRun = new FutureRunnable<T>(task);
		Spout.getScheduler().scheduleSyncDelayedTask(plugin, futureRun);
		return futureRun;
	}

	@Override
	public void cancelAllTasks() {
		Spout.getScheduler().cancelAllTasks();
	}

	@Override
	public void cancelTask(int taskId) {
		Spout.getScheduler().cancelTask(taskId);
	}

	@Override
	public void cancelTasks(Plugin plugin) {
		Spout.getScheduler().cancelTasks(plugin);
	}

	@Override
	public List<BukkitWorker> getActiveWorkers() {
		throw new UnsupportedOperationException();
	}

	@Override
	public List<BukkitTask> getPendingTasks() {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean isCurrentlyRunning(int taskId) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean isQueued(int taskId) {
		return Spout.getScheduler().isQueued(taskId);
	}

	@Override
	public int scheduleAsyncDelayedTask(Plugin plugin, Runnable task) {
		return scheduleAsyncDelayedTask(plugin, task, 0);
	}

	@Override
	public int scheduleAsyncDelayedTask(Plugin plugin, Runnable task, long delay) {
		return scheduleAsyncRepeatingTask(plugin, task, delay, -1L);
	}

	@Override
	public int scheduleAsyncRepeatingTask(Plugin plugin, Runnable task, long delay, long period) {
		return 0;
		//return Spout.getEngine().getScheduler().scheduleAsyncRepeatingTask(plugin, task, delay * 50L, (period > 0 ? period * 50L : period), TaskPriority.NORMAL);
	}

	@Override
	public int scheduleSyncDelayedTask(Plugin plugin, Runnable task) {
		return scheduleSyncDelayedTask(plugin, task, 0);
	}

	@Override
	public int scheduleSyncDelayedTask(Plugin plugin, Runnable task, long delay) {
		return scheduleSyncRepeatingTask(plugin, task, delay, -1L);
	}

	@Override
	public int scheduleSyncRepeatingTask(Plugin plugin, Runnable task, long delay, long period) {
		return Spout.getEngine().getScheduler().scheduleSyncRepeatingTask(plugin, task, delay * 50L, (period > 0 ? period * 50L : period), TaskPriority.NORMAL);
	}

	private static class FutureRunnable<T> implements Runnable, Future<T> {
		private final Callable<T> future;
		private volatile T result;
		private volatile ExecutionException ex;
		private volatile boolean cancelled = false;
		private final AtomicBoolean done = new AtomicBoolean(false);

		FutureRunnable(Callable<T> future) {
			this.future = future;
		}

		@Override
		public void run() {
			if (cancelled) {
				return;
			}
			try {
				result = future.call();
			} catch (Exception e) {
				ex = new ExecutionException(e);
			}
			done.set(true);
			done.notify();
		}

		@Override
		public boolean cancel(boolean mayInterruptIfRunning) {
			if (!cancelled) {
				cancelled = true;
				return !done.get();
			}
			return false;
		}

		@Override
		public boolean isCancelled() {
			return cancelled;
		}

		@Override
		public boolean isDone() {
			return done.get();
		}

		@Override
		public T get() throws InterruptedException, ExecutionException {
			if (!done.get()) {
				done.wait();
			}
			if (ex != null) {
				throw ex;
			} else {
				return result;
			}
		}

		@Override
		public T get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
			if (!done.get()) {
				done.wait(unit.toMillis(timeout));
			}
			if (done.get()) {
				return get();
			}
			throw new TimeoutException();
		}
	}

	@Override
	public BukkitTask runTask(Plugin arg0, Runnable arg1) throws IllegalArgumentException {
		throw new UnsupportedOperationException();
	}

	@Override
	public BukkitTask runTaskAsynchronously(Plugin arg0, Runnable arg1) throws IllegalArgumentException {
		throw new UnsupportedOperationException();
	}

	@Override
	public BukkitTask runTaskLater(Plugin arg0, Runnable arg1, long arg2) throws IllegalArgumentException {
		throw new UnsupportedOperationException();
	}

	@Override
	public BukkitTask runTaskLaterAsynchronously(Plugin arg0, Runnable arg1, long arg2) throws IllegalArgumentException {
		throw new UnsupportedOperationException();
	}

	@Override
	public BukkitTask runTaskTimer(Plugin arg0, Runnable arg1, long arg2, long arg3) throws IllegalArgumentException {
		throw new UnsupportedOperationException();
	}

	@Override
	public BukkitTask runTaskTimerAsynchronously(Plugin arg0, Runnable arg1, long arg2, long arg3) throws IllegalArgumentException {
		throw new UnsupportedOperationException();
	}
}
