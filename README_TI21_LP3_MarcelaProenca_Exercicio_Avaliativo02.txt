ABSTRAÇÂO:Foi utilizado um modelo real, uma cervejaria, para uma abstração através da orientação a objetos.Nessa abstração formaram-se classes
(que são descrições de um conjunto de objetos,o qual compartilha atributos(características) e 
comportamentos(métodos) em comum*.Uma definicão de classe descreve todos os atributos dos objetos membros da classe,
 assim como os métodos que implementam o comportamento destes membros*.De forma simplificada,um projeto orientado a objetos de um sistema divide-se em três etapas:
 a)identificar as abstrações/entidades envolvidas no problema;
 b)identificar o comportamento que cada uma destas entidades deve ser capaz de 
 fornecer;
 c)identificar os relacionamentos entre estas entidades; 
 d)identificar as estruturas de dados internas necessárias para implementar o comportamento e relacionamentos desejado.

ENCAPSULAMENTO:os atributos presentes nas classes são encapsulados mediante os modificadores de acesso chamados private, os quais definem o encapsulamento
 de atributos e métodos.Através desse modificador, é possível alterar esses atributos somente na classe a qual pertencem, inclusive nos métodos como parâmetros.Visíveis 
 apenas para objetos da própria classe*.Logo, o acesso fora da classe fica impossibilitado, restringindo modificações externas à classe, proporcinando maior segurança 
 ao projeto.Métodos que devem ser acessados somente dentro da própria classe, 
devem ser especificados como "private" e o contrário se faz mediante "public".
Métodos GET:Retornam o valor do estado atual de um objeto, uma vez que não é possível acessá-lo diretamente*.
Métodos SET:Permitem alterar o valor do estado atual do objeto, também chamados por alguns autores de mutantes*.

HERANÇA:
É uma relação de classe mãe e classe filha, que em java, é possível relacionarmos uma classe de tal maneira que uma delas herda tudo que a outra tem.A classe "Cerveja" é 
a extensão da classe "Produto", essa extensão que define a herança entre as classes, é indicada pela palavra "extends" após o nome da classe filha.Então fica
"public class Cerveja extends Produto"e "public class Usuario extends Pessoa".Produto e Pessoa são classes super-classes-pai-tipo, enquanto que Cerveja e Usuario 
são Subclasses-filha-Subtipo.As subclasses podem herdar os métodos e atributos de suas superclasses.A subclasse pode definir novos métodos e atributos específicos*.A chamada do método
construtor na superclasse é realizada através da palavra "super" e seguida de argumentos específicos.A chamada do método construtor da superclasse deve ser sempre o primeiro comando a 
aparecer no construtor da subclasse:
 'public Usuario(String nome, LocalDate dataNascimento, Endereco endereco, String documento, String userName, String senha) {
        super(nome, dataNascimento, endereco, documento);
        this.userName = userName;
        this.senha = senha;
    }'

    ' public Cerveja(String nome, BigDecimal valor, LocalDate dataFabricacao, LocalDate dataVencimento, String origem,
                   TipoCerveja tipo, double teorAlcoolico, int volume) {
        super(nome, valor, dataFabricacao, dataVencimento, origem);
        this.tipo = tipo;
        this.teorAlcoolico = teorAlcoolico;
        this.volume = volume;
    }
'
OBS:A classe Produto é uma classe abstrata,isto é, pode conter métodos concretos e abstratos.Os abstratos não podem ser implementados na classe abstrata, apenas naquelas 
que por herança herdam  métodos e atributos e forem concretas.Os métodos concretos podem sofrer implementação na classe abstrata sem problemas.

POLIMORFISMO:
É  a capacidade de um objeto poder ser referenciado de várias formas*.É  a capacidade de redefinir um método com a mesma assinatura em sua subclasse.

#VANTAGENS E MOTIVAÇÕES DE CADA UM DOS PILARES:
A)ABSTRAÇÂO
Através da linguagem Java, por Orientação a objetos é possível implementar modelos práticos da vida real por abstração, como foi realizado no projeto CevaJa.
B)ENCAPSULAMENTO
Confere segurança ao projeto mediante o uso de modificadores de acesso, nesse caso, o private, que oferece um comportamento privado.
C)HERANÇA
Como citado acima, as subclasses podem herdar os métodos e atributos das superclasses, o que facilita a modelagem das classes, o emprego de métodos, além de conferir um código mais limpo,
poupando reescrita de códigos e tempo para o desenvolvedor.Possibilita uma estrutura mais organizada do projeto. 

D)POLIMORFISMO
As Subclasses herdam a assinatura do método da Superclasse.Não há a necessidade de reescrever os métodos em todas as classes, apenas são sobrescritos(aqueles que são abstratos), 
facilitando as práticas clean code.Como ocorre na subclasse classe Usuario, a qual herda o método abstrato 'public boolean possuiPedido()' da 
superclasse Pessoa(a qual é abstrata),que será implementado nesta classe concreta, sobrescrito com @Override. 



#Fonte:
Material de aula de Linguagem de Programção I-Professor Mateus Costa.