package br.com.caelum.stella.nfe.builder.generated;

public final class COFINSOutrImpl implements COFINSOutr, br.com.caelum.stella.nfe.ObjectCreator {
    private final br.com.caelum.stella.nfe.modelo.COFINSOutr cOFINSOutr;

    public COFINSOutrImpl() {
        cOFINSOutr = new br.com.caelum.stella.nfe.modelo.COFINSOutr();
    }

    public br.com.caelum.stella.nfe.modelo.COFINSOutr getInstance() {
        return cOFINSOutr;
    }

    public COFINSOutr withCodigoSituacaoTributaria(final String string) {
        cOFINSOutr.setCodigoSituacaoTributaria(string);
        return this;
    }

    public COFINSOutr withValorDaBaseDeCalculo(final String string) {
        cOFINSOutr.setvalorDaBaseDeCalculo(string);
        return this;
    }

    public COFINSOutr withAliquotaEmPercentual(final String string) {
        cOFINSOutr.setAliquotaEmPercentual(string);
        return this;
    }

    public COFINSOutr withQuantidadeVendida(final String string) {
        cOFINSOutr.setQuantidadeVendida(string);
        return this;
    }

    public COFINSOutr withAliquota(final String string) {
        cOFINSOutr.setAliquota(string);
        return this;
    }

    public COFINSOutr withValor(final String string) {
        cOFINSOutr.setValor(string);
        return this;
    }
}