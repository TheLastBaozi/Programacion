<h1>MONOPOLY THE GAME</h1>
<p>Se supone que has comentado que puedo cambiar lo del Monopoly Simplicado porque no se entiende... right?</p>
<p>Okay... pues siendote sincero no me ha gustado la pr&aacute;ctica y te vengo a proponer de otra manera</p>

<h4>¿Qué tiene el juego del Monopoly?</h4>
<ul>
    <li>Jugadores</li>
    <li>Y el juego del Monopoly</li>
</ul>

<p>Voy a intentar poner todo, totalmente todo, pero que todo lo que se supone que hemos dado en acción</p>

<h2>JUGADORES</h2>
<h4>¿Qué son los jugadores?</h4>
<p>Como deberías saber para poder jugar a un juego de mesa, necesitas alguien jugadonlo, uno mismo, los perros, el gato, un pepinillo, AI, o humanos o lo que se te ocurre</p>
<p>Por lo que voy a intentar dar una breve explicación de que hay que hacer...</p>
<h3>Time de la Acción</h3>
<h4>El paquete Principal</h4>
<p>Lo primero que haremos es crear un paquete para todo el Juego, por ejemplo MonopolyTheGame</p>
<h4>Clase Jugador</h4>
<p>Dentro vamos a crear la clase "Jugador"</p>
<p>En ella vamos a tener como atributo:
    <ol>
        <li>( String ) Nombre</li>
        <li>( String ) Color</li>
    </ol>
</p>
<p>Pero el bonus está que vamos a elegir el color por ENUM... y serán las siguientes: Los que quieras? La cantidad de colores que quieras...</p>
<h4>Constructor de la clase</h4>
<p>El contructor de la clase lo vamos a crear pidiendo un nombre, y un color del ENUM, dependiendo de que color sea, le asignaremos un COLOR EN ASCII</p>

<p>
switch (color){
    <ul type="none">
        <li>case ROJO -> this.color="\u001B[31m";</li>
        <li>case AMARILLO -> this.color="\u001B[33m";</li>
        <li>case VERDE -> this.color="\u001B[32m";</li>
        <li>case AZUL -> this.color="\u001B[34m";</li>
    </ul>
}
</p>











