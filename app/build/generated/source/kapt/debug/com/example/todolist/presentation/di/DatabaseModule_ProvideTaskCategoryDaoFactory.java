// Generated by Dagger (https://dagger.dev).
package com.example.todolist.presentation.di;

import com.example.todolist.data.db.TaskCategoryDao;
import com.example.todolist.data.db.TaskDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DatabaseModule_ProvideTaskCategoryDaoFactory implements Factory<TaskCategoryDao> {
  private final Provider<TaskDatabase> taskDatabaseProvider;

  public DatabaseModule_ProvideTaskCategoryDaoFactory(Provider<TaskDatabase> taskDatabaseProvider) {
    this.taskDatabaseProvider = taskDatabaseProvider;
  }

  @Override
  public TaskCategoryDao get() {
    return provideTaskCategoryDao(taskDatabaseProvider.get());
  }

  public static DatabaseModule_ProvideTaskCategoryDaoFactory create(
      Provider<TaskDatabase> taskDatabaseProvider) {
    return new DatabaseModule_ProvideTaskCategoryDaoFactory(taskDatabaseProvider);
  }

  public static TaskCategoryDao provideTaskCategoryDao(TaskDatabase taskDatabase) {
    return Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.provideTaskCategoryDao(taskDatabase));
  }
}