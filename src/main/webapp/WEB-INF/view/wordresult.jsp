<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@page contentType="text/html;charset=UTF-8" language="java" %>
        <%@page isELIgnored="false" %>
            <!DOCTYPE html>
            <html>

            <head>
                <meta charset="ISO-8859-1">
                <title>Lingo Spring</title>


            </head>

            <body>
                <h1 align="center">Marisabel's Lingo Project</h1>
                <hr>
                              <div>Credits : ${game.credits} | Attempt: ${game.attempts} / ${game.tries}</div>

  <h3 align="center" color="red">Word to guess: ${words.word}</h3>
                <form:form action="process-guess" method="get" modelAttribute="words">
                    <div align="center">

                        <p> <label for="word">Guess a 5 letter word.</label></p>
                        <p>
                            <form:input id="word" path="guess"/>
                            <br>
                            <form:errors path="guess"/>
                            Previous guess: ${words.guess}<br/>
                            Result: ${words.result}
                        </p>

                        <input type="submit" value="Guess the Word">
                    </div>
                </form:form>
            </body>

            </html>