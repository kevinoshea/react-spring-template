import React, { FC } from 'react';
import { createStyles, makeStyles } from '@material-ui/core';

import './SkeletonReactSpring.css';

const useStyles = makeStyles(() =>
  createStyles({
    welcome: {
      margin: '10px',
      fontWeight: 'bold',
    },
  })
);

const SkeletonReactSpring: FC = () => {
  const classes = useStyles();
  return (
    <div className="skeleton-react-spring-app">
      <div className={classes.welcome}>Welcome!</div>
    </div>
  );
};

export default SkeletonReactSpring;
