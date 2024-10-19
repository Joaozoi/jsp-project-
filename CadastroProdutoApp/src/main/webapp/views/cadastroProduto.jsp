<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Adicionar Produto - Timolina</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css">

</head>
<body>
    <header>
        <div class="logo">Timolina</div>
        <div class="menu">
            <a href="#"> Bem-vindo</a>
            <a href="#"> Entre ou cadastre-se</a>
            <a href="cadastroProduto.jsp">Adicionar produto</a>
            <a href="#">Carrinho</a>
        </div>
    </header>

    <main>
        <h2>Adicionar produto</h2>
        <form action="produtoServlet" method="post" enctype="multipart/form-data">
            <label for="nome">Nome</label>
            <input type="text" id="nome" name="nome" required>

            <label for="valor">Valor</label>
            <input type="number" id="valor" name="valor" required placeholder="R$">

            <label for="categoria">Categoria</label>
            <input type="text" id="categoria" name="categoria" required>

            <label for="marca">Marca</label>
            <input type="text" id="marca" name="marca" required>

            <label for="imagem">Imagem</label>
            <input type="file" id="imagem" name="imagem" required>

            <button type="submit">Cadastrar</button>
        </form>

       
     
    </main>

</body>
</html>
