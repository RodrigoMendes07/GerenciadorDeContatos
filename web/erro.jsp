<%-- 
    Document   : erro
    Created on : 05/08/2020, 20:51:10
    Author     : ti
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pagina de Erro.</title>
        <!-- Foi colocado no final para a página carregar mais rápido -->
        <link href="dist/css/bootstrap.min.css" rel="stylesheet" >
        <script src="dist/js/jquery341.js"></script>
        <script src="dist/js/popper.min.js"></script>
        <script src="dist/js/bootstrap.min.js"></script>
    </head>
    <body>
        <style>
            h4 {
                color: #a8141c;
                margin-bottom: .8rem;
                position: relative;
                font-family: 'Raleway', sans-serif;
                font-size: 1.5rem;
            }

            p {
                margin-top: 0;
                margin-bottom: 1rem;
                display: block;
                margin-block-start: 1em;
                margin-block-end: 1em;
                margin-inline-start: 0px;
                margin-inline-end: 0px;
                color: rgb(113, 120, 126);
                font-family: 'Lato', sans-serif;
            }

            .btn-primary:hover {
                color: #fff !important;
                background-color: #609 !important;
                border-color: #609 !important;
            }

            .btn-primary {
                color: #fff !important;
                background-color: #609 !important;
                border-color: #609 !important;
            }

            .btn-round {
                border-radius: 30px !important;
                text-decoration: none;
            }

            .btn {
                font-size: 15px;
                font-weight: 600;
                padding: 9px 25px;
                border-width: 2px;
            }

            .btn {
                display: inline-block;
                font-weight: 400;
                text-align: center;
                white-space: nowrap;
                vertical-align: middle;
                -webkit-user-select: none;
                -moz-user-select: none;
                -ms-user-select: none;
                user-select: none;
                border: 1px solid transparent;
                padding: .375rem .75rem;
                font-size: 1rem;
                line-height: 1.5;
                border-radius: .25rem;
                transition: color .15s ease-in-out,background-color .15s ease-in-out,border-color .15s ease-in-out,box-shadow .15s ease-in-out;
            }

            .btn:not(:disabled):not(.disabled) {
                cursor: pointer;
            }
            /*[404 error page]
    --------------------------*/
            .error-content {
                padding: 0 0 70px;
            }

            .error-text {
                text-align: center;
            }

            .error {
                font-size: 120px;
                font-weight: 100;
            }

            @keyframes bob {
                0% {
                    top: 0;
                }

                50% {
                    top: 0.2em;
                }
            }

            .im-sheep {
                display: inline-block;
                position: relative;
                font-size: 1em;
                margin-bottom: 70px;
            }

            .im-sheep * {
                transition: transform 0.3s;
            }

            .im-sheep .top {
                position: relative;
                top: 0;
                animation: bob 1s infinite;
            }

            .im-sheep:hover .head {
                transform: rotate(0deg);
            }

            .im-sheep:hover .head .im-eye {
                width: 1.25em;
                height: 1.25em;
            }

            .im-sheep:hover .head .im-eye:before {
                right: 30%;
            }

            .im-sheep:hover .top {
                animation-play-state: paused;
            }

            .im-sheep .head {
                display: inline-block;
                width: 5em;
                height: 5em;
                border-radius: 100%;
                background: #a8141c;
                vertical-align: middle;
                position: relative;
                top: 1em;
                transform: rotate(30deg);
            }

            .im-sheep .head:before {
                content: '';
                display: inline-block;
                width: 80%;
                height: 50%;
                background: #a8141c;
                position: absolute;
                bottom: 0;
                right: -10%;
                border-radius: 50% 40%;
            }

            .im-sheep .head:hover .im-ear.one, .im-sheep .head:hover .im-ear.two {
                transform: rotate(0deg);
            }

            .im-sheep .head .im-eye {
                display: inline-block;
                width: 1em;
                height: 1em;
                border-radius: 100%;
                background: white;
                position: absolute;
                overflow: hidden;
            }

            .im-sheep .head .im-eye:before {
                content: '';
                display: inline-block;
                background: black;
                width: 50%;
                height: 50%;
                border-radius: 100%;
                position: absolute;
                right: 10%;
                bottom: 10%;
                transition: all 0.3s;
            }

            .im-sheep .head .im-eye.one {
                right: -2%;
                top: 1.7em;
            }

            .im-sheep .head .im-eye.two {
                right: 2.5em;
                top: 1.7em;
            }

            .im-sheep .head .im-ear {
                background: #a8141c;
                width: 50%;
                height: 30%;
                border-radius: 100%;
                position: absolute;
            }

            .im-sheep .head .im-ear.one {
                left: -10%;
                top: 5%;
                transform: rotate(-30deg);
            }

            .im-sheep .head .im-ear.two {
                top: 2%;
                right: -5%;
                transform: rotate(20deg);
            }

            .im-sheep .body {
                display: inline-block;
                width: 7em;
                height: 7em;
                border-radius: 100%;
                background: #ed1c24;
                position: relative;
                vertical-align: middle;
                margin-right: -3em;
            }

            .im-sheep .im-legs {
                display: inline-block;
                position: absolute;
                top: 80%;
                left: 10%;
                z-index: -1;
            }

            .im-sheep .im-legs .im-leg {
                display: inline-block;
                background: #141214;
                width: 0.5em;
                height: 2.5em;
                margin: 0.2em;
            }

            .im-sheep::before {
                left: 0;
                content: '';
                display: inline-block;
                position: absolute;
                top: 112%;
                width: 100%;
                height: 18%;
                border-radius: 100%;
                background: rgba(0, 0, 0, 0.2);
            }
        </style>
        <div class="error-content">
            <div class="container">
                <div class="row">
                    <div class="col-md-12 ">
                        <div class="error-text">
                            <br>
                            <br>
                            <h3 class="error">Oops Erro 404!</h3>
                            <div class="im-sheep">
                                <div class="top">
                                    <div class="body"></div>
                                    <div class="head">
                                        <div class="im-eye one"></div>
                                        <div class="im-eye two"></div>
                                        <div class="im-ear one"></div>
                                        <div class="im-ear two"></div>
                                    </div>
                                </div>
                                <div class="im-legs">
                                    <div class="im-leg"></div>
                                    <div class="im-leg"></div>
                                    <div class="im-leg"></div>
                                    <div class="im-leg"></div>
                                </div>
                            </div>
                            <h5>A página que você procura não foi encontrada ou a sua solicitação não foi processada!</h5>
                            <a href="index.jsp" class="btn btn-danger btn-round">Ir para página principal</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>    
    </body>
</html>
