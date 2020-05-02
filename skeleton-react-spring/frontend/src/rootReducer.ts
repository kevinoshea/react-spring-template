import { combineReducers } from 'redux';
import { configureStore } from '@reduxjs/toolkit';

const rootReducer = combineReducers({});

export type RootStore = ReturnType<typeof rootReducer>;

const store = configureStore({
  reducer: rootReducer,
});

export type StoreDispatch = typeof store.dispatch;

export const { dispatch } = store;

export default store;
