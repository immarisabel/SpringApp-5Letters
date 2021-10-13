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
                          <div>Credits : ${game.scoreDTO.credits} | Attempt: ${game.scoreDTO.attempts} / ${game.scoreDTO.tries}</div>
                <h3 align="center" color="red">Word to guess: ${game.wordsDTO.word}</h3>
                <form:form action="process-guess" method="get" modelAttribute="game">
                    <div align="center">

                        <p> <label for="word">Guess a 5 letter word.</label></p>
                        <p>
                            <form:input id="word" path="wordsDTO.guess"/>
                            <br>
                            <form:errors path="wordsDTO.guess"/>
                            Previous guess: ${game.wordsDTO.guess}<br/>
                            Result: ${game.wordsDTO.result}
                        </p>

                        <input type="submit" value="Guess the Word">
                    </div>
                </form:form>
            </body>

            </html>