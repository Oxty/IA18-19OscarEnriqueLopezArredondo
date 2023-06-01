import numpy as np
from keras.models import Sequential
from keras.layers import Dense


fahrenheit_train = np.array([-40, 14, 32, 46, 59, 72, 100], dtype=float)
celsius_train = np.array([-40, -10, 0, 8, 15, 22, 38], dtype=float)


model = Sequential()

model.add(Dense(1, input_shape=[1])) 

model.add(Dense(1))  


model.compile(loss='mean_squared_error', optimizer='adam')


model.fit(fahrenheit_train, celsius_train, epochs=500, verbose=0)


celsius_test = np.array([20], dtype=float)


fahrenheit_test = model.predict(celsius_test)


fahrenheit_test = fahrenheit_test * 1.8 + 32


for celsius, fahrenheit in zip(celsius_test, fahrenheit_test):
    print(f"{celsius:.2f} grados Celsius equivale a {fahrenheit[0]:.2f} grados Fahrenheit.")
