# LYA1
DIAGRAMAS A BNF
BNF (Programa)
<Programa>::=<Bloque>.

BNFs (Bloques)

BNF (Bloque 1)

<Bloque 1>::=const id = num ;|const id = num , <Bloque 1>


BNF (Bloque 2)

<Bloque 2>::= var id ; | var id , <Bloque 2>
BNF (Bloque 3)

<Bloque 3>::= proced id ; <Bloque> ; <Bloque 3>
<Bloques>::=<Bloque 1><Bloque 2><Bloque 3>
BNF(Condición) 

<Condición>::= <expre> == <expre>|<expre> != <expre>|<expre> < <expre>|<expre> > <expre>|<expre> <= <expre>|<expre> >= <expre>  
BNFs (Proposición)




BNF (Proposición 1) 

<proposición>::= begin <Proposición> end|begin <proposición> ; <proposición 1> end

BNF (Proposición 2)

<Proposición 2>::= id = <expre>
BNF (Proposición 3)

<caracter>::= id|num
<Proposición 3>::= write <caracter>
BNF (Proposición 4)

<Proposición 4>::= read id
BNF (Proposición 5)

<Proposición 5>::= call id
BNF (Proposición 6)

<Proposición 6>::= if <condición> the <proposición>
BNF (Proposición 7)

<Proposición 7>::= while <condición> do <proposición>

BNF (Proposición 8)

<identificador>::= to|dto
<Proposición 8>::= for id = <expre> <identificador> <expre> do <proposición>
BNF (Expre)

<Operador M>::= +|-
<Expre>::= <término>|<término> <Operador M> <Expre>
BNF (Término)

<Operador N>::= *|/
<Término>::=<factor>|<factor> <Operador N> <término>
BNF (Factor)

<Factor>::= (<expre>)|id|num
