#language: es
#author: Yariela Gonzalez

@Stories
Característica: Buscar estado de situacion financiera
  Yo como usuario
  Deseo poder acceder a la pagina de aeronautica civil
  Para entrar a la seccion de estados financieros y poder encontrar el PDF

  @Scenario1
  Escenario: Abrir el PDF estado de situacion financiera

    Dado que el usuario ingresa a la pagina de aeronautica
    Cuando selecciona las diferentes opciones del menu hasta llegar al estado financiero de abril
    Entonces se debe abrir correctamente el archivo Estado de Situación Financiera a 30 de abril de 2021
