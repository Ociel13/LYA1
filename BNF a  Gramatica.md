# LYA1
BNF A GRAMATICA 

GRAMATICA (Programa)
<Programa>::=<Bloque>.

BNFs a Gramaticas (Bloques)

Gramatica (Bloque 1)
<Bloque 1>::= const id = num ;
<Bloque 1>::= const id = num , <Bloque 1>

Gramática (Bloque 2)
<Bloque 2>::= var id ; 
<Bloque 2>::= var id , <Bloque 2>

Gramática (Bloque 3)
<Bloque 3>::= proced id ; <Bloque> ; <Bloque 3>

Gramática (Bloques)
<Bloques>::=<Bloque 1><Bloque 2><Bloque 3>

Gramática (Condición) 
<Condición>::= <expre> == <expre>
<Condición>::= <expre> != <expre>
<Condición>::= <expre> < <expre>
<Condición>::= <expre> > <expre>
<Condición>::= <expre> <= <expre>
<Condición>::= <expre> >= <expre>
BNFs a Gramáticas (Proposición)

Gramaticas (Proposición 1) 
<proposición>::= begin <Proposición> end
<proposición>::= begin <proposición> ; <proposición 1> end

Gramaticas (Proposición 2) 
<Proposición 2>::= id = <expre>

Gramatica (Proposición 3) 
<caracter>::= id
<caracter>::= num
<Proposición 3>::= write <caracter>

Gramaticas (Proposición 4) 
<Proposición 4>::= read id

Gramaticas (Proposición 5) 
<Proposición 5>::= call id

Gramaticas (Proposición 6) 
<Proposición 6>::= if <condición> the <proposición>

Gramaticas (Proposición 7) 
<Proposición 7>::= while <condición> do <proposición>

Gramaticas (Proposición 8) 
<identificador>::= to
<identificador>::= dto
<Proposición 8>::= for id = <expre> <identificador> <expre> do <proposición>

Gramaticas (Expre)
<Operador M>::= +
<Operador M>::= -
<Expre>::= <término>
<Expre>::= <término> <Operador M> <Expre> 

Gramaticas (Término)
<Operador N>::= *
<Operador N>::= /
<Término>::=<factor>
<Término>::= <factor> <Operador N> <término>

Gramática (Factor) 
<Factor>::= (<expre>)
<Factor>::= id
<Factor>::= num
