# 2- (medio-difícil) CONTADOR ID CLIENTES

Vamos a crear un generador de ids de clientes, y para ello nos valdremos del static. OJO! Si borras un cliente, no pueden cambiar los ids de los que vienen detrás.
Propuesta 3 ejercicios al respecto:

1º - ¿Cómo haces un contador simple SIN static, con un método en la clase? El método puede llamarse sumarUno(), por ejemplo.

2º- Cómo haces un contador simple CON static => contador de clase, que cada vez que llames al método te sume uno. SumaTotal = SumaTotal +1 (saber cuantas veces has llamado al método)

(quien quiera puede saltar a este directamente) :

3º - Contador con static que se aplique a los clientes, y que conserve el número de id de cliente aunque se borren otros. Pista: os recuerdo que existen las variables intermedias (estás creando un contador static pero lo debes poder aplicar a cada objeto). Quiere decir que el primer cliente que damos de alta tiene el idCliente=1, el segundo =2, etc. Crear 3 ó 4 e imprimir el num de id de cada cliente, que tiene ser consecutivo, incluso aunque borres cliente entre medio.

PD: podéis usar debuggar para ver por dónde va el flujo del programa, y ver cuanto vale la variable idCliente
