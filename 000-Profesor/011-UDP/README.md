## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

#### Consigna del tp

1) Necesitamos una app que se ejecute cada 1 minuto, que lea desde un archivo en disco ($home/bulk.txt) una lista de archivos,
donde cada linea del archivo representa una ruta absoluta a un archivo particular.
dicha app debe procesar un conjunto de 10 entradas a la vez, en donde, cada entrada debe ser procesada de la forma:
    i) Si el archivo no existe, debe crearlo
    ii) Si existe, debe borrarlo
Si en alguno de los dos puntos anteriores falla, se debe generar un archivo de traza con los archivos que no se pudieron
borrar/crear anteponiendo una B/C

