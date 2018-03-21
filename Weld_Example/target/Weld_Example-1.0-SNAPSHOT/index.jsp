<%-- 
    Document   : index
    Created on : 19/03/2018, 23:27:11
    Author     : ThigoYure
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <!--Import materialize.css-->
        <link type="text/css" rel="stylesheet" href="css/materialize.min.css" media="screen,projection"/>
        <!--Let browser know website is optimized for mobile-->
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <title>WELD(CDI) - Example</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body class="amber lighten-3">
        <div class="row">
            <div class="card light-blue accent-2 col s4 offset-s4">
                <div class="card-content white-text">
                    <h4 class="center-align" style="font-family: fantasy">Cadastro - Pessoa</h4>
                    <form action="FrontController" method="POST" >
                        <div class="row">
                            <div class="input-field col s12">
                                <input name="email" id="email" type="email" class="validate">
                                <label class="white-text" for="email">Email</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input name="senha" type="password" class="validate">
                                <label class="white-text" for="senha">Senha</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input id="nome" name="nome" type="text" class="validate">
                                <label class="white-text" for="nome">Nome</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input id="profissao" name="profissao" type="text" class="validate">
                                <label class="white-text" for="profissao">Profissão</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input name="nascimento" type="text" class="datepicker" required>
                                <label class="white-text" for="birthdate">Data de nascimento</label>
                            </div> 
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <select name="sexo" required>
                                    <option value="Masculino">Masculino</option>
                                    <option value="Feminino">Feminino</option>
                                </select>
                                <label class="white-text">Sexo</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12"><input type="hidden" name="controller" value="CadastroController"></div>
                        </div>
                        <div class="row center-align">
                            <input class="light-blue waves-effect waves-light btn" type="submit" value="Salvar">
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <div class="row">
            <p class=" white-text center-align">&copy; 2018 Thiago Yure<p>
        </div>
        <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
        <script type="text/javascript">
            $(document).ready(function () {
                $('.datepicker').pickadate({
                    selectMonths: true, // Creates a dropdown to control month
                    selectYears: 15,
                    monthsFull: ['01', '02', '03', '04', '05', '06', '07', '08', '09', '10', '11', '12'],
                    monthsShort: ['Jan', 'Fev', 'Mar', 'Abr', 'Mai', 'Jun', 'Jul', 'Ago', 'Set', 'Out', 'Nov', 'Dez'],
                    weekdaysFull: ['Domingo', 'Segunda', 'Terça', 'Quarta', 'Quinta', 'Sexta', 'Sabádo'],
                    weekdaysShort: ['Dom', 'Seg', 'Ter', 'Qua', 'Qui', 'Sex', 'Sab'],
                    today: 'Hoje',
                    clear: 'Limpar',
                    close: 'Pronto',
                    labelMonthNext: 'Próximo mês',
                    labelMonthPrev: 'Mês anterior',
                    labelMonthSelect: 'Selecione um mês',
                    labelYearSelect: 'Selecione um ano',
                    format: 'dd/mm/yyyy'
                });
                $('select').material_select();
            });
        </script>
        <script type="text/javascript" src="js/materialize.min.js"></script>
    </body>
</html>