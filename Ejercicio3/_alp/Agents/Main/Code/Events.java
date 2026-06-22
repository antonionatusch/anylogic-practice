void evRecogerTipo1()
{/*ALCODESTART::1782094079586*/
while (zonaTemporalTipo1.size() > 0) {
    Pieza p = zonaTemporalTipo1.removeFirst();
    enterAlmacen.take(p);
}
/*ALCODEEND*/}

void evRecogerTipo2()
{/*ALCODESTART::1782094136903*/
while (zonaTemporalTipo2.size() > 0) {
    Pieza p = zonaTemporalTipo2.removeFirst();
    enterAlmacen.take(p);
}
/*ALCODEEND*/}

