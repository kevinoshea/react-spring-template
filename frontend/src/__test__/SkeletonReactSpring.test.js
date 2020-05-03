import React from 'react';
import Enzyme, { mount } from 'enzyme';
import { Provider } from 'react-redux';
import configureStore from 'redux-mock-store';
import Adapter from 'enzyme-adapter-react-16';
import thunk from 'redux-thunk';

const mockStore = configureStore([thunk]);

import SkeletonReactSpring from '../SkeletonReactSpring';

Enzyme.configure({ adapter: new Adapter() });

const renderApp = () => {
  const initialState = {
    app: {
      user: null,
    },
  };

  const store = mockStore(initialState);

  return (
    <Provider store={store}>
      <SkeletonReactSpring />
    </Provider>
  );
};

describe('SkeletonReactSpring', () => {
  test('it renders without failing', () => {
    const app = mount(renderApp());
    expect(app.find('.skeleton-react-spring')).not.toBeNull();
  });
});
