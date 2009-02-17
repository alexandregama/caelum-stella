package br.com.caelum.stella.nfe.builder.generated;

import java.util.Calendar;

import br.com.caelum.stella.nfe.modelo.TUf;
import br.com.caelum.stella.tinytype.CNPJ;

public final class AvulsaImpl implements Avulsa, br.com.caelum.stella.nfe.ObjectCreator {

    private final br.com.caelum.stella.nfe.modelo.Avulsa avulsa;

    public AvulsaImpl() {
        avulsa = new br.com.caelum.stella.nfe.modelo.Avulsa();
    }

    public br.com.caelum.stella.nfe.modelo.Avulsa getInstance() {
        return avulsa;
    }

    public Avulsa withCnpj(final CNPJ cnpj) {
        avulsa.setCNPJ(cnpj.getNumero());
        return this;
    }

    public Avulsa withXOrgao(final String string) {
        avulsa.setXOrgao(string);
        return this;
    }

    public Avulsa withMatr(final String string) {
        avulsa.setMatr(string);
        return this;
    }

    public Avulsa withXAgente(final String string) {
        avulsa.setXAgente(string);
        return this;
    }

    public Avulsa withFone(final String string) {
        avulsa.setFone(string);
        return this;
    }

    public Avulsa withUf(final TUf tUf) {
        avulsa.setUF(tUf);
        return this;
    }

    public Avulsa withNdar(final String string) {
        avulsa.setNDAR(string);
        return this;
    }

    public Avulsa withDEmi(final Calendar calendar) {
        avulsa.setDEmi(calendar);
        return this;
    }

    public Avulsa withVdar(final String string) {
        avulsa.setVDAR(string);
        return this;
    }

    public Avulsa withRepEmi(final String string) {
        avulsa.setRepEmi(string);
        return this;
    }

    public Avulsa withDPag(final Calendar calendar) {
        avulsa.setDPag(calendar);
        return this;
    }
}