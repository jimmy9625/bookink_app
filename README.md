# booking_app

# **Pruebas automatizadas para la aplicación móvil de Booking**
Este repositorio contiene pruebas automatizadas para la funcionalidad de reserva de hotel en la aplicación móvil de Booking. Las pruebas están desarrolladas en Java utilizando el gestor de dependencias Gradle y el patrón de diseño Screenplay.
## **Requisitos previos**
Antes de ejecutar las pruebas, asegúrese de tener los siguientes requisitos previos instalados:

- Appium Server
- Dispositivo Android o emulador con Android 7.0 o superior
- JDK 1.8 o superior
- Gradle 6.0 o superior
##
## **Instalación**
1. Clone este repositorio en su máquina local :
2. git clone [https://github.com/<your-username>/booking-automation.git](https://github.com/%3cyour-username%3e/booking-automation.git)

   Descargue la aplicación móvil de Booking desde el siguiente enlace: <https://drive.google.com/file/d/1ruY_5qcqWlsE3-W3rgXpFyyMiO59wFUc/view>
2. Instale la aplicación en su dispositivo o emulador de Android.


## **Configuración**
Antes de ejecutar las pruebas, asegúrese de actualizar las siguientes variables en el archivo **src/main/java/com/co/booking/userinterfaces/utils/Driver.java**:

deviceName

udid

URL De el servidor de appium

##
## **Ejecución de pruebas**
Para ejecutar las pruebas debe estar corriendo el servidor de appium , abra una terminal y navegue hasta el directorio raíz del proyecto y ejecute el siguiente comando:

gradle clean test
