package dev.k2.commons;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
public class TestXsdFileRepository implements XsdFileRepository{
    @Override
    public String saveFile(byte[] file, String fileName) {
        return "xd";
    }

    @Override
    public byte[] getFile(String fileId) {
        return ("<?xml version=\"1.0\" encoding=\"UTF-8\"?><xsd:schema xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:etd=\"http://crd.gov.pl/xml/schematy/dziedzinowe/mf/2021/06/09/eD/DefinicjeTypy/\" xmlns:kck=\"http://crd.gov.pl/xml/schematy/dziedzinowe/mf/2020/10/13/eD/KodyCECHKRAJOW/\" xmlns:knus=\"http://crd.gov.pl/xml/schematy/dziedzinowe/mf/2017/02/06/eD/KodyNaczelnikowUrzedowSkarbowych/\" xmlns:tns=\"http://crd.gov.pl/wzor/2021/08/27/10848/\" targetNamespace=\"http://crd.gov.pl/wzor/2021/08/27/10848/\" elementFormDefault=\"qualified\" attributeFormDefault=\"unqualified\" xml:lang=\"pl\">\n" +
                        "\t<xsd:import namespace=\"http://crd.gov.pl/xml/schematy/dziedzinowe/mf/2021/06/09/eD/DefinicjeTypy/\" schemaLocation=\"http://crd.gov.pl/xml/schematy/dziedzinowe/mf/2021/06/09/eD/DefinicjeTypy/StrukturyDanych_v9-0E.xsd\"/>\n" +
                        "\t<xsd:import namespace=\"http://crd.gov.pl/xml/schematy/dziedzinowe/mf/2017/02/06/eD/KodyNaczelnikowUrzedowSkarbowych/\" schemaLocation=\"http://crd.gov.pl/xml/schematy/dziedzinowe/mf/2017/02/06/eD/KodyNaczelnikowUrzedowSkarbowych/KodyNaczelnikowUrzedowSkarbowych_v4-0E.xsd\"/>\n" +
                        "\t<xsd:import namespace=\"http://crd.gov.pl/xml/schematy/dziedzinowe/mf/2020/10/13/eD/KodyCECHKRAJOW/\" schemaLocation=\"http://crd.gov.pl/xml/schematy/dziedzinowe/mf/2020/10/13/eD/KodyCECHKRAJOW/KodyCechKrajowISO_v5-0E.xsd\"/>\n" +
                        "\t<xsd:complexType name=\"TNaglowek\">\n" +
                        "\t\t<xsd:annotation>\n" +
                        "\t\t\t<xsd:documentation>Nagłówek zgłoszenia</xsd:documentation>\n" +
                        "\t\t</xsd:annotation>\n" +
                        "\t\t<xsd:sequence>\n" +
                        "\t\t\t<xsd:element name=\"KodFormularza\">\n" +
                        "\t\t\t\t<xsd:complexType>\n" +
                        "\t\t\t\t\t<xsd:simpleContent>\n" +
                        "\t\t\t\t\t\t<xsd:extension base=\"tns:TKodFormularza\">\n" +
                        "\t\t\t\t\t\t\t<xsd:attribute name=\"kodSystemowy\" type=\"xsd:string\" use=\"required\" fixed=\"ZAP-3 (6)\"/>\n" +
                        "\t\t\t\t\t\t\t<xsd:attribute name=\"wersjaSchemy\" type=\"xsd:string\" use=\"required\" fixed=\"1-0E\"/>\n" +
                        "\t\t\t\t\t\t</xsd:extension>\n" +
                        "\t\t\t\t\t</xsd:simpleContent>\n" +
                        "\t\t\t\t</xsd:complexType>\n" +
                        "\t\t\t</xsd:element>\n" +
                        "\t\t\t<xsd:element name=\"WariantFormularza\">\n" +
                        "\t\t\t\t<xsd:simpleType>\n" +
                        "\t\t\t\t\t<xsd:restriction base=\"xsd:byte\">\n" +
                        "\t\t\t\t\t\t<xsd:enumeration value=\"6\"/>\n" +
                        "\t\t\t\t\t</xsd:restriction>\n" +
                        "\t\t\t\t</xsd:simpleType>\n" +
                        "\t\t\t</xsd:element>\n" +
                        "\t\t\t<xsd:element name=\"CelZlozenia\">\n" +
                        "\t\t\t\t<xsd:annotation>\n" +
                        "\t\t\t\t\t<xsd:documentation>Cel złożenia: 1 - złożenie zgłoszenia</xsd:documentation>\n" +
                        "\t\t\t\t</xsd:annotation>\n" +
                        "\t\t\t\t<xsd:simpleType>\n" +
                        "\t\t\t\t\t<xsd:restriction base=\"xsd:byte\">\n" +
                        "\t\t\t\t\t\t<xsd:enumeration value=\"1\">\n" +
                        "\t\t\t\t\t\t\t<xsd:annotation>\n" +
                        "\t\t\t\t\t\t\t\t<xsd:documentation>Złożenie zgłoszenia aktualizacyjnego</xsd:documentation>\n" +
                        "\t\t\t\t\t\t\t</xsd:annotation>\n" +
                        "\t\t\t\t\t\t</xsd:enumeration>\n" +
                        "\t\t\t\t\t</xsd:restriction>\n" +
                        "\t\t\t\t</xsd:simpleType>\n" +
                        "\t\t\t</xsd:element>\n" +
                        "\t\t\t<xsd:element name=\"Data\" type=\"tns:TDataWypelnienia\">\n" +
                        "\t\t\t\t<xsd:annotation>\n" +
                        "\t\t\t\t\t<xsd:documentation>Data wypełnienia zgłoszenia</xsd:documentation>\n" +
                        "\t\t\t\t</xsd:annotation>\n" +
                        "\t\t\t</xsd:element>\n" +
                        "\t\t\t<xsd:element name=\"KodUrzedu\">\n" +
                        "\t\t\t\t<xsd:annotation>\n" +
                        "\t\t\t\t\t<xsd:documentation>Naczelnik urzędu skarbowego, do którego jest adresowane zgłoszenie</xsd:documentation>\n" +
                        "\t\t\t\t</xsd:annotation>\n" +
                        "\t\t\t\t<xsd:complexType>\n" +
                        "\t\t\t\t\t<xsd:simpleContent>\n" +
                        "\t\t\t\t\t\t<xsd:extension base=\"knus:TKodNaczUS\"/>\n" +
                        "\t\t\t\t\t</xsd:simpleContent>\n" +
                        "\t\t\t\t</xsd:complexType>\n" +
                        "\t\t\t</xsd:element>\n" +
                        "\t\t</xsd:sequence>\n" +
                        "\t</xsd:complexType>\n" +
                        "\t<xsd:complexType name=\"TOsobaFiz\">\n" +
                        "\t\t<xsd:annotation>\n" +
                        "\t\t\t<xsd:documentation>Dane identyfikacyjne osoby fizycznej</xsd:documentation>\n" +
                        "\t\t</xsd:annotation>\n" +
                        "\t\t<xsd:sequence>\n" +
                        "\t\t\t<xsd:element name=\"PESEL\" type=\"etd:TNrPESEL\">\n" +
                        "\t\t\t\t<xsd:annotation>\n" +
                        "\t\t\t\t\t<xsd:documentation>Identyfikator podatkowy numer PESEL</xsd:documentation>\n" +
                        "\t\t\t\t</xsd:annotation>\n" +
                        "\t\t\t</xsd:element>\n" +
                        "\t\t\t<xsd:element name=\"Nazwisko\">\n" +
                        "\t\t\t\t<xsd:annotation>\n" +
                        "\t\t\t\t\t<xsd:documentation>Nazwisko</xsd:documentation>\n" +
                        "\t\t\t\t</xsd:annotation>\n" +
                        "\t\t\t\t<xsd:complexType>\n" +
                        "\t\t\t\t\t<xsd:simpleContent>\n" +
                        "\t\t\t\t\t\t<xsd:extension base=\"tns:TNazwisko\"/>\n" +
                        "\t\t\t\t\t</xsd:simpleContent>\n" +
                        "\t\t\t\t</xsd:complexType>\n" +
                        "\t\t\t</xsd:element>\n" +
                        "\t\t\t<xsd:element name=\"ImiePierwsze\">\n" +
                        "\t\t\t\t<xsd:annotation>\n" +
                        "\t\t\t\t\t<xsd:documentation>Pierwsze imię</xsd:documentation>\n" +
                        "\t\t\t\t</xsd:annotation>\n" +
                        "\t\t\t\t<xsd:complexType>\n" +
                        "\t\t\t\t\t<xsd:simpleContent>\n" +
                        "\t\t\t\t\t\t<xsd:extension base=\"tns:TImie\"/>\n" +
                        "\t\t\t\t\t</xsd:simpleContent>\n" +
                        "\t\t\t\t</xsd:complexType>\n" +
                        "\t\t\t</xsd:element>\n" +
                        "\t\t\t<xsd:element name=\"ImieOjca\" type=\"etd:TImie\" minOccurs=\"0\">\n" +
                        "\t\t\t\t<xsd:annotation>\n" +
                        "\t\t\t\t\t<xsd:documentation>Imię ojca</xsd:documentation>\n" +
                        "\t\t\t\t</xsd:annotation>\n" +
                        "\t\t\t</xsd:element>\n" +
                        "\t\t\t<xsd:element name=\"ImieMatki\" type=\"etd:TImie\" minOccurs=\"0\">\n" +
                        "\t\t\t\t<xsd:annotation>\n" +
                        "\t\t\t\t\t<xsd:documentation>Imię matki</xsd:documentation>\n" +
                        "\t\t\t\t</xsd:annotation>\n" +
                        "\t\t\t</xsd:element>\n" +
                        "\t\t\t<xsd:element name=\"NIP\" type=\"etd:TNrNIP\" minOccurs=\"0\">\n" +
                        "\t\t\t\t<xsd:annotation>\n" +
                        "\t\t\t\t\t<xsd:documentation>Identyfikator podatkowy NIP</xsd:documentation>\n" +
                        "\t\t\t\t</xsd:annotation>\n" +
                        "\t\t\t</xsd:element>\n" +
                        "\t\t</xsd:sequence>\n" +
                        "\t\t<!--ImieOjca, ImieMatki oraz NIP należy wypełnić tylko w przypadku dokonujących pierwszego zgłoszenia ZAP-3: \n" +
                        "            - ImieOjca, ImieMatki dotyczą osób, które przed uzyskaniem numeru PESEL miały status podatnika,  \n" +
                        "            - NIP dotyczy osób, które przed uzyskaniem numeru PESEL miały nadany identyfikator podatkowy NIP.-->\n" +
                        "\t</xsd:complexType>\n" +
                        "\t<xsd:complexType name=\"TRachunekBankowy\">\n" +
                        "\t\t<xsd:annotation>\n" +
                        "\t\t\t<xsd:documentation>Informacje o rachunku bankowym</xsd:documentation>\n" +
                        "\t\t</xsd:annotation>\n" +
                        "\t\t<xsd:sequence>\n" +
                        "\t\t\t<xsd:annotation>\n" +
                        "\t\t\t\t<xsd:documentation/>\n" +
                        "\t\t\t</xsd:annotation>\n" +
                        "\t\t\t<xsd:element name=\"PosiadaczRachunku\" type=\"etd:TZnakowy\">\n" +
                        "\t\t\t\t<xsd:annotation>\n" +
                        "\t\t\t\t\t<xsd:documentation>Posiadacz rachunku</xsd:documentation>\n" +
                        "\t\t\t\t</xsd:annotation>\n" +
                        "\t\t\t\t<!--należy wskazać imię i nazwisko posiadacza, a w przypadku gdy jest to rachunek wspólny - imiona i nazwiska wszystkich współposiadaczy-->\n" +
                        "\t\t\t</xsd:element>\n" +
                        "\t\t\t<xsd:element name=\"NrRachunkuBankowego\" type=\"tns:TNrIBAN\">\n" +
                        "\t\t\t\t<xsd:annotation>\n" +
                        "\t\t\t\t\t<xsd:documentation>Pełny numer rachunku - numer IBAN</xsd:documentation>\n" +
                        "\t\t\t\t</xsd:annotation>\n" +
                        "\t\t\t</xsd:element>\n" +
                        "\t\t\t<xsd:sequence minOccurs=\"0\">\n" +
                        "\t\t\t\t<xsd:element name=\"KrajSiedzibyBanku\" type=\"etd:TKodKraju\">\n" +
                        "\t\t\t\t\t<xsd:annotation>\n" +
                        "\t\t\t\t\t\t<xsd:documentation>Kraj siedziby banku (oddziału)</xsd:documentation>\n" +
                        "\t\t\t\t\t</xsd:annotation>\n" +
                        "\t\t\t\t\t<!--wypełnić wyłącznie dla rachunku zagranicznego.-->\n" +
                        "\t\t\t\t</xsd:element>\n" +
                        "\t\t\t\t<xsd:element name=\"KodSWIFT\" type=\"tns:SWIFT_Type\">\n" +
                        "\t\t\t\t\t<xsd:annotation>\n" +
                        "\t\t\t\t\t\t<xsd:documentation>Kod SWIFT</xsd:documentation>\n" +
                        "\t\t\t\t\t</xsd:annotation>\n" +
                        "\t\t\t\t\t<!--wypełnić wyłącznie dla rachunku zagranicznego-->\n" +
                        "\t\t\t\t</xsd:element>\n" +
                        "\t\t\t</xsd:sequence>\n" +
                        "\t\t\t<xsd:element name=\"Waluta\" type=\"kck:currCode_Type\">\n" +
                        "\t\t\t\t<xsd:annotation>\n" +
                        "\t\t\t\t\t<xsd:documentation>Waluta, w której prowadzony jest rachunek</xsd:documentation>\n" +
                        "\t\t\t\t</xsd:annotation>\n" +
                        "\t\t\t</xsd:element>\n" +
                        "\t\t</xsd:sequence>\n" +
                        "\t</xsd:complexType>\n" +
                        "\t<xsd:simpleType name=\"TKodFormularza\">\n" +
                        "\t\t<xsd:annotation>\n" +
                        "\t\t\t<xsd:documentation>Symbol wzoru formularza</xsd:documentation>\n" +
                        "\t\t</xsd:annotation>\n" +
                        "\t\t<xsd:restriction base=\"xsd:string\">\n" +
                        "\t\t\t<xsd:enumeration value=\"ZAP-3\"/>\n" +
                        "\t\t</xsd:restriction>\n" +
                        "\t</xsd:simpleType>\n" +
                        "\t<xsd:simpleType name=\"TImie\">\n" +
                        "\t\t<xsd:annotation>\n" +
                        "\t\t\t<xsd:documentation>Imię</xsd:documentation>\n" +
                        "\t\t</xsd:annotation>\n" +
                        "\t\t<xsd:restriction base=\"xsd:string\">\n" +
                        "\t\t\t<xsd:whiteSpace value=\"preserve\"/>\n" +
                        "\t\t\t<xsd:pattern value=\"[\\p{Lu}]{1}[\\p{Lu}( )-]{0,58}[\\p{Lu}]{1}|[\\p{Lu}]{1}\"/>\n" +
                        "\t\t</xsd:restriction>\n" +
                        "\t</xsd:simpleType>\n" +
                        "\t<xsd:simpleType name=\"TNazwisko\">\n" +
                        "\t\t<xsd:annotation>\n" +
                        "\t\t\t<xsd:documentation>Nazwisko</xsd:documentation>\n" +
                        "\t\t</xsd:annotation>\n" +
                        "\t\t<xsd:restriction base=\"xsd:string\">\n" +
                        "\t\t\t<xsd:whiteSpace value=\"preserve\"/>\n" +
                        "\t\t\t<xsd:pattern value=\"[\\p{Lu}]{1}[\\p{Lu}( )-]{0,158}[\\p{Lu}]{1}|[\\p{Lu}]{1}\"/>\n" +
                        "\t\t</xsd:restriction>\n" +
                        "\t</xsd:simpleType>\n" +
                        "\t<xsd:simpleType name=\"SWIFT_Type\">\n" +
                        "\t\t<xsd:annotation>\n" +
                        "\t\t\t<xsd:documentation>Kod SWIFT</xsd:documentation>\n" +
                        "\t\t</xsd:annotation>\n" +
                        "\t\t<xsd:restriction base=\"xsd:string\">\n" +
                        "\t\t\t<xsd:pattern value=\"[A-Z]{6}[A-Z0-9]{2}([A-Z0-9]{3}){0,1}\"/>\n" +
                        "\t\t</xsd:restriction>\n" +
                        "\t</xsd:simpleType>\n" +
                        "\t<xsd:simpleType name=\"TWyborT\">\n" +
                        "\t\t<xsd:annotation>\n" +
                        "\t\t\t<xsd:documentation>Informacja o wartości pozycji:T - tak</xsd:documentation>\n" +
                        "\t\t</xsd:annotation>\n" +
                        "\t\t<xsd:restriction base=\"xsd:string\">\n" +
                        "\t\t\t<xsd:enumeration value=\"T\">\n" +
                        "\t\t\t\t<xsd:annotation>\n" +
                        "\t\t\t\t\t<xsd:documentation>tak</xsd:documentation>\n" +
                        "\t\t\t\t</xsd:annotation>\n" +
                        "\t\t\t</xsd:enumeration>\n" +
                        "\t\t</xsd:restriction>\n" +
                        "\t</xsd:simpleType>\n" +
                        "\t<xsd:simpleType name=\"TDataWypelnienia\">\n" +
                        "\t\t<xsd:restriction base=\"etd:TData\">\n" +
                        "\t\t\t<xsd:minInclusive value=\"2021-09-01\"/>\n" +
                        "\t\t</xsd:restriction>\n" +
                        "\t</xsd:simpleType>\n" +
                        "\t<xsd:simpleType name=\"TAdresEmail\">\n" +
                        "\t\t<xsd:annotation>\n" +
                        "\t\t\t<xsd:documentation>Adres e-mail</xsd:documentation>\n" +
                        "\t\t</xsd:annotation>\n" +
                        "\t\t<xsd:restriction base=\"xsd:token\">\n" +
                        "\t\t\t<xsd:minLength value=\"3\"/>\n" +
                        "\t\t\t<xsd:maxLength value=\"255\"/>\n" +
                        "\t\t\t<xsd:pattern value=\"(.)+@(.)+\"/>\n" +
                        "\t\t</xsd:restriction>\n" +
                        "\t</xsd:simpleType>\n" +
                        "\t<xsd:simpleType name=\"TNrIBAN\">\n" +
                        "\t\t<xsd:annotation>\n" +
                        "\t\t\t<xsd:documentation>Numer IBAN</xsd:documentation>\n" +
                        "\t\t</xsd:annotation>\n" +
                        "\t\t<xsd:restriction base=\"xsd:string\">\n" +
                        "\t\t\t<xsd:pattern value=\"[A-Z]{2}[0-9]{2}[0-9A-Z]{10,30}\"/>\n" +
                        "\t\t</xsd:restriction>\n" +
                        "\t</xsd:simpleType>\n" +
                        "\t<xsd:complexType name=\"TAdresPolski1\">\n" +
                        "\t\t<xsd:annotation>\n" +
                        "\t\t\t<xsd:documentation>Informacje opisujące adres polski - bez elementu Poczta</xsd:documentation>\n" +
                        "\t\t</xsd:annotation>\n" +
                        "\t\t<xsd:sequence>\n" +
                        "\t\t\t<xsd:element name=\"KodKraju\" type=\"etd:TKodKraju\" fixed=\"PL\">\n" +
                        "\t\t\t\t<xsd:annotation>\n" +
                        "\t\t\t\t\t<xsd:documentation>Kraj</xsd:documentation>\n" +
                        "\t\t\t\t</xsd:annotation>\n" +
                        "\t\t\t</xsd:element>\n" +
                        "\t\t\t<xsd:element name=\"Wojewodztwo\" type=\"etd:TJednAdmin\">\n" +
                        "\t\t\t\t<xsd:annotation>\n" +
                        "\t\t\t\t\t<xsd:documentation>Województwo</xsd:documentation>\n" +
                        "\t\t\t\t</xsd:annotation>\n" +
                        "\t\t\t</xsd:element>\n" +
                        "\t\t\t<xsd:element name=\"Powiat\" type=\"etd:TJednAdmin\">\n" +
                        "\t\t\t\t<xsd:annotation>\n" +
                        "\t\t\t\t\t<xsd:documentation>Powiat</xsd:documentation>\n" +
                        "\t\t\t\t</xsd:annotation>\n" +
                        "\t\t\t</xsd:element>\n" +
                        "\t\t\t<xsd:element name=\"Gmina\" type=\"etd:TJednAdmin\">\n" +
                        "\t\t\t\t<xsd:annotation>\n" +
                        "\t\t\t\t\t<xsd:documentation>Gmina</xsd:documentation>\n" +
                        "\t\t\t\t</xsd:annotation>\n" +
                        "\t\t\t</xsd:element>\n" +
                        "\t\t\t<xsd:element name=\"Ulica\" type=\"etd:TUlica\" minOccurs=\"0\">\n" +
                        "\t\t\t\t<xsd:annotation>\n" +
                        "\t\t\t\t\t<xsd:documentation>Nazwa ulicy</xsd:documentation>\n" +
                        "\t\t\t\t</xsd:annotation>\n" +
                        "\t\t\t</xsd:element>\n" +
                        "\t\t\t<xsd:element name=\"NrDomu\" type=\"etd:TNrBudynku\">\n" +
                        "\t\t\t\t<xsd:annotation>\n" +
                        "\t\t\t\t\t<xsd:documentation>Numer budynku</xsd:documentation>\n" +
                        "\t\t\t\t</xsd:annotation>\n" +
                        "\t\t\t</xsd:element>\n" +
                        "\t\t\t<xsd:element name=\"NrLokalu\" type=\"etd:TNrLokalu\" minOccurs=\"0\">\n" +
                        "\t\t\t\t<xsd:annotation>\n" +
                        "\t\t\t\t\t<xsd:documentation>Numer lokalu</xsd:documentation>\n" +
                        "\t\t\t\t</xsd:annotation>\n" +
                        "\t\t\t</xsd:element>\n" +
                        "\t\t\t<xsd:element name=\"Miejscowosc\" type=\"etd:TMiejscowosc\">\n" +
                        "\t\t\t\t<xsd:annotation>\n" +
                        "\t\t\t\t\t<xsd:documentation>Nazwa miejscowości</xsd:documentation>\n" +
                        "\t\t\t\t</xsd:annotation>\n" +
                        "\t\t\t</xsd:element>\n" +
                        "\t\t\t<xsd:element name=\"KodPocztowy\" type=\"etd:TKodPocztowy\">\n" +
                        "\t\t\t\t<xsd:annotation>\n" +
                        "\t\t\t\t\t<xsd:documentation>Kod pocztowy</xsd:documentation>\n" +
                        "\t\t\t\t</xsd:annotation>\n" +
                        "\t\t\t</xsd:element>\n" +
                        "\t\t\t<xsd:element name=\"NrSkrytkiPocztowej\">\n" +
                        "\t\t\t\t<xsd:annotation>\n" +
                        "\t\t\t\t\t<xsd:documentation>Numer skrytki pocztowej</xsd:documentation>\n" +
                        "\t\t\t\t</xsd:annotation>\n" +
                        "\t\t\t\t<xsd:simpleType>\n" +
                        "\t\t\t\t\t<xsd:restriction base=\"etd:TZnakowy\">\n" +
                        "\t\t\t\t\t\t<xsd:maxLength value=\"20\"/>\n" +
                        "\t\t\t\t\t</xsd:restriction>\n" +
                        "\t\t\t\t</xsd:simpleType>\n" +
                        "\t\t\t</xsd:element>\n" +
                        "\t\t</xsd:sequence>\n" +
                        "\t</xsd:complexType>\n" +
                        "\t<xsd:element name=\"ZgloszenieNIP\">\n" +
                        "\t\t<xsd:annotation>\n" +
                        "\t\t\t<xsd:documentation>ZGŁOSZENIE AKTUALIZACYJNE OSOBY FIZYCZNEJ BĘDĄCEJ PODATNIKIEM</xsd:documentation>\n" +
                        "\t\t</xsd:annotation>\n" +
                        "\t\t<xsd:complexType>\n" +
                        "\t\t\t<xsd:sequence>\n" +
                        "\t\t\t\t<xsd:element name=\"Naglowek\" type=\"tns:TNaglowek\">\n" +
                        "\t\t\t\t\t<xsd:annotation>\n" +
                        "\t\t\t\t\t\t<xsd:documentation>Nagłówek zgłoszenia</xsd:documentation>\n" +
                        "\t\t\t\t\t</xsd:annotation>\n" +
                        "\t\t\t\t</xsd:element>\n" +
                        "\t\t\t\t<xsd:element name=\"Podmiot1\">\n" +
                        "\t\t\t\t\t<xsd:annotation>\n" +
                        "\t\t\t\t\t\t<xsd:documentation>B. DANE SKŁADAJĄCEGO</xsd:documentation>\n" +
                        "\t\t\t\t\t</xsd:annotation>\n" +
                        "\t\t\t\t\t<xsd:complexType>\n" +
                        "\t\t\t\t\t\t<xsd:sequence>\n" +
                        "\t\t\t\t\t\t\t<xsd:element name=\"OsobaFizyczna\">\n" +
                        "\t\t\t\t\t\t\t\t<xsd:annotation>\n" +
                        "\t\t\t\t\t\t\t\t\t<xsd:documentation>B.1. DANE IDENTYFIKACYJNE</xsd:documentation>\n" +
                        "\t\t\t\t\t\t\t\t</xsd:annotation>\n" +
                        "\t\t\t\t\t\t\t\t<xsd:complexType>\n" +
                        "\t\t\t\t\t\t\t\t\t<xsd:complexContent>\n" +
                        "\t\t\t\t\t\t\t\t\t\t<xsd:extension base=\"tns:TOsobaFiz\"/>\n" +
                        "\t\t\t\t\t\t\t\t\t</xsd:complexContent>\n" +
                        "\t\t\t\t\t\t\t\t</xsd:complexType>\n" +
                        "\t\t\t\t\t\t\t</xsd:element>\n" +
                        "\t\t\t\t\t\t\t<xsd:element name=\"AdresZamieszkania\">\n" +
                        "\t\t\t\t\t\t\t\t<xsd:annotation>\n" +
                        "\t\t\t\t\t\t\t\t\t<xsd:documentation>B.2. ADRES MIEJSCA ZAMIESZKANIA</xsd:documentation>\n" +
                        "\t\t\t\t\t\t\t\t</xsd:annotation>\n" +
                        "\t\t\t\t\t\t\t\t<xsd:complexType>\n" +
                        "\t\t\t\t\t\t\t\t\t<xsd:complexContent>\n" +
                        "\t\t\t\t\t\t\t\t\t\t<xsd:extension base=\"etd:TAdres1\">\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t<xsd:attribute name=\"rodzajAdresu\" type=\"xsd:string\" use=\"required\" fixed=\"RAD\">\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t<xsd:annotation>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\t<xsd:documentation>Adres zamieszkania</xsd:documentation>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t</xsd:annotation>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t</xsd:attribute>\n" +
                        "\t\t\t\t\t\t\t\t\t\t</xsd:extension>\n" +
                        "\t\t\t\t\t\t\t\t\t</xsd:complexContent>\n" +
                        "\t\t\t\t\t\t\t\t</xsd:complexType>\n" +
                        "\t\t\t\t\t\t\t</xsd:element>\n" +
                        "\t\t\t\t\t\t</xsd:sequence>\n" +
                        "\t\t\t\t\t\t<xsd:attribute name=\"rola\" type=\"xsd:string\" use=\"required\" fixed=\"Składający\"/>\n" +
                        "\t\t\t\t\t</xsd:complexType>\n" +
                        "\t\t\t\t</xsd:element>\n" +
                        "\t\t\t\t<xsd:element name=\"Kontakt\" minOccurs=\"0\">\n" +
                        "\t\t\t\t\t<xsd:annotation>\n" +
                        "\t\t\t\t\t\t<xsd:documentation>B.3. DANE KONTAKTOWE</xsd:documentation>\n" +
                        "\t\t\t\t\t</xsd:annotation>\n" +
                        "\t\t\t\t\t<!--Wpisane niżej dane aktualizują poprzedni stan danych.-->\n" +
                        "\t\t\t\t\t<xsd:complexType>\n" +
                        "\t\t\t\t\t\t<xsd:sequence minOccurs=\"0\">\n" +
                        "\t\t\t\t\t\t\t<xsd:choice minOccurs=\"0\">\n" +
                        "\t\t\t\t\t\t\t\t<xsd:element name=\"Telefon\">\n" +
                        "\t\t\t\t\t\t\t\t\t<xsd:annotation>\n" +
                        "\t\t\t\t\t\t\t\t\t\t<xsd:documentation>Telefon</xsd:documentation>\n" +
                        "\t\t\t\t\t\t\t\t\t</xsd:annotation>\n" +
                        "\t\t\t\t\t\t\t\t\t<xsd:simpleType>\n" +
                        "\t\t\t\t\t\t\t\t\t\t<xsd:restriction base=\"etd:TZnakowy\">\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t<xsd:maxLength value=\"16\"/>\n" +
                        "\t\t\t\t\t\t\t\t\t\t</xsd:restriction>\n" +
                        "\t\t\t\t\t\t\t\t\t</xsd:simpleType>\n" +
                        "\t\t\t\t\t\t\t\t</xsd:element>\n" +
                        "\t\t\t\t\t\t\t\t<xsd:element name=\"RezygnacjaZTelefonu\" type=\"tns:TWyborT\">\n" +
                        "\t\t\t\t\t\t\t\t\t<xsd:annotation>\n" +
                        "\t\t\t\t\t\t\t\t\t\t<xsd:documentation>Rezygnacja z telefonu: T - tak (dotyczy wskazanego wcześniej numeru telefonu)</xsd:documentation>\n" +
                        "\t\t\t\t\t\t\t\t\t</xsd:annotation>\n" +
                        "\t\t\t\t\t\t\t\t</xsd:element>\n" +
                        "\t\t\t\t\t\t\t</xsd:choice>\n" +
                        "\t\t\t\t\t\t\t<xsd:choice minOccurs=\"0\">\n" +
                        "\t\t\t\t\t\t\t\t<xsd:element name=\"Faks\">\n" +
                        "\t\t\t\t\t\t\t\t\t<xsd:annotation>\n" +
                        "\t\t\t\t\t\t\t\t\t\t<xsd:documentation>Faks</xsd:documentation>\n" +
                        "\t\t\t\t\t\t\t\t\t</xsd:annotation>\n" +
                        "\t\t\t\t\t\t\t\t\t<xsd:simpleType>\n" +
                        "\t\t\t\t\t\t\t\t\t\t<xsd:restriction base=\"etd:TZnakowy\">\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t<xsd:maxLength value=\"16\"/>\n" +
                        "\t\t\t\t\t\t\t\t\t\t</xsd:restriction>\n" +
                        "\t\t\t\t\t\t\t\t\t</xsd:simpleType>\n" +
                        "\t\t\t\t\t\t\t\t</xsd:element>\n" +
                        "\t\t\t\t\t\t\t\t<xsd:element name=\"RezygnacjaZFaksu\" type=\"tns:TWyborT\">\n" +
                        "\t\t\t\t\t\t\t\t\t<xsd:annotation>\n" +
                        "\t\t\t\t\t\t\t\t\t\t<xsd:documentation>Rezygnacja z faksu: T - tak (dotyczy wskazanego wcześniej numeru faksu)</xsd:documentation>\n" +
                        "\t\t\t\t\t\t\t\t\t</xsd:annotation>\n" +
                        "\t\t\t\t\t\t\t\t</xsd:element>\n" +
                        "\t\t\t\t\t\t\t</xsd:choice>\n" +
                        "\t\t\t\t\t\t\t<xsd:choice minOccurs=\"0\">\n" +
                        "\t\t\t\t\t\t\t\t<xsd:element name=\"Email\" type=\"tns:TAdresEmail\">\n" +
                        "\t\t\t\t\t\t\t\t\t<xsd:annotation>\n" +
                        "\t\t\t\t\t\t\t\t\t\t<xsd:documentation>Adres e-mail</xsd:documentation>\n" +
                        "\t\t\t\t\t\t\t\t\t</xsd:annotation>\n" +
                        "\t\t\t\t\t\t\t\t</xsd:element>\n" +
                        "\t\t\t\t\t\t\t\t<xsd:element name=\"RezygnacjaZAdresuEmail\" type=\"tns:TWyborT\">\n" +
                        "\t\t\t\t\t\t\t\t\t<xsd:annotation>\n" +
                        "\t\t\t\t\t\t\t\t\t\t<xsd:documentation>Rezygnacja z adresu e-mail: T - tak (dotyczy wskazanego wcześniej adresu e-mail)</xsd:documentation>\n" +
                        "\t\t\t\t\t\t\t\t\t</xsd:annotation>\n" +
                        "\t\t\t\t\t\t\t\t</xsd:element>\n" +
                        "\t\t\t\t\t\t\t</xsd:choice>\n" +
                        "\t\t\t\t\t\t\t<xsd:sequence minOccurs=\"0\">\n" +
                        "\t\t\t\t\t\t\t\t<xsd:element name=\"AdresDoDoreczen\" minOccurs=\"0\">\n" +
                        "\t\t\t\t\t\t\t\t\t<xsd:annotation>\n" +
                        "\t\t\t\t\t\t\t\t\t\t<xsd:documentation>B.3.1. ADRES DO DORĘCZEŃ</xsd:documentation>\n" +
                        "\t\t\t\t\t\t\t\t\t</xsd:annotation>\n" +
                        "\t\t\t\t\t\t\t\t\t<!--Należy wypełnić tylko wówczas, gdy adres do doręczeń jest inny niż adres miejsca zamieszkania (w części B.2.).-->\n" +
                        "\t\t\t\t\t\t\t\t\t<xsd:complexType>\n" +
                        "\t\t\t\t\t\t\t\t\t\t<xsd:choice minOccurs=\"0\">\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t<xsd:sequence minOccurs=\"0\">\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t<xsd:element name=\"AdresDoDoreczen1\" type=\"etd:TWybor1\" fixed=\"1\">\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\t<xsd:annotation>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<xsd:documentation>Adres do doręczeń: 1 - tak</xsd:documentation>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\t</xsd:annotation>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\t<!--Doręczanie następuje zgodnie z przepisami ustawy z dnia 29 sierpnia 1997 r. - Ordynacja podatkowa (Dz. U. z 2020 r. poz. 1325, z późn. zm.) na adres miejsca zamieszkania, o ile nie wskazano na adres do doręczeń albo skrytki pocztowej.-->\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t</xsd:element>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t<xsd:element name=\"AdresPol\">\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\t<xsd:complexType>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<xsd:complexContent>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<xsd:extension base=\"etd:TAdresPolski1\">\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<xsd:attribute name=\"rodzajAdresu\" type=\"xsd:string\" use=\"required\" fixed=\"DOR\">\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<xsd:annotation>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<xsd:documentation>Adres do doręczeń</xsd:documentation>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</xsd:annotation>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</xsd:attribute>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</xsd:extension>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</xsd:complexContent>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\t</xsd:complexType>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t</xsd:element>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t</xsd:sequence>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t<xsd:sequence minOccurs=\"0\">\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t<xsd:element name=\"AdresDoDoreczen2\" type=\"etd:TWybor1_2\" fixed=\"2\" minOccurs=\"0\">\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\t<xsd:annotation>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<xsd:documentation>Adres do doręczeń: 2 - nie</xsd:documentation>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\t</xsd:annotation>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t</xsd:element>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t<xsd:element name=\"UtrataAktualnosciAdresu\" type=\"etd:TWybor1\" minOccurs=\"0\">\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\t<xsd:annotation>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<xsd:documentation>Utrata aktualności ostatnio wskazanego adresu do doręczeń, innego niż adres w części B.2.: 1 - tak</xsd:documentation>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\t</xsd:annotation>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t</xsd:element>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t</xsd:sequence>\n" +
                        "\t\t\t\t\t\t\t\t\t\t</xsd:choice>\n" +
                        "\t\t\t\t\t\t\t\t\t</xsd:complexType>\n" +
                        "\t\t\t\t\t\t\t\t</xsd:element>\n" +
                        "\t\t\t\t\t\t\t\t<xsd:element name=\"AdresSkrytki\" minOccurs=\"0\">\n" +
                        "\t\t\t\t\t\t\t\t\t<xsd:annotation>\n" +
                        "\t\t\t\t\t\t\t\t\t\t<xsd:documentation>B.3.2. ADRES SKRYTKI POCZTOWEJ</xsd:documentation>\n" +
                        "\t\t\t\t\t\t\t\t\t</xsd:annotation>\n" +
                        "\t\t\t\t\t\t\t\t\t<!--Podanie informacji o skrytce pocztowej nie jest obowiązkowe.-->\n" +
                        "\t\t\t\t\t\t\t\t\t<xsd:complexType>\n" +
                        "\t\t\t\t\t\t\t\t\t\t<xsd:choice minOccurs=\"0\">\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t<xsd:sequence minOccurs=\"0\">\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t<xsd:element name=\"AdresSkrytki1\" type=\"etd:TWybor1_2\" fixed=\"1\">\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\t<xsd:annotation>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<xsd:documentation>Adres do doręczeń: 1 - tak</xsd:documentation>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\t</xsd:annotation>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\t<!--Doręczanie następuje zgodnie z przepisami ustawy z dnia 29 sierpnia 1997 r. - Ordynacja podatkowa (Dz. U. z 2020 r. poz. 1325, z późn. zm.) na adres miejsca zamieszkania, o ile nie wskazano na adres do doręczeń albo skrytki pocztowej.-->\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t</xsd:element>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t<xsd:element name=\"AdresPol\">\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\t<xsd:annotation>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<xsd:documentation>Adres skrytki pocztowej</xsd:documentation>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\t</xsd:annotation>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\t<xsd:complexType>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<xsd:complexContent>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<xsd:extension base=\"tns:TAdresPolski1\">\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<xsd:attribute name=\"rodzajAdresu\" type=\"xsd:string\" use=\"required\" fixed=\"SKR\">\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<xsd:annotation>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<xsd:documentation>Adres skrytki pocztowej</xsd:documentation>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</xsd:annotation>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</xsd:attribute>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</xsd:extension>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</xsd:complexContent>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\t</xsd:complexType>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t</xsd:element>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t</xsd:sequence>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t<xsd:sequence minOccurs=\"0\">\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t<xsd:element name=\"AdresSkrytki2\" type=\"etd:TWybor1_2\" fixed=\"2\" minOccurs=\"0\">\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\t<xsd:annotation>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<xsd:documentation>Adres do doręczeń: 2 - nie</xsd:documentation>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\t</xsd:annotation>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t</xsd:element>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t<xsd:element name=\"Rezygnacja\" type=\"etd:TWybor1\" minOccurs=\"0\">\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\t<xsd:annotation>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<xsd:documentation>Rezygnacja: 1 - tak</xsd:documentation>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\t</xsd:annotation>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t</xsd:element>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t</xsd:sequence>\n" +
                        "\t\t\t\t\t\t\t\t\t\t</xsd:choice>\n" +
                        "\t\t\t\t\t\t\t\t\t</xsd:complexType>\n" +
                        "\t\t\t\t\t\t\t\t</xsd:element>\n" +
                        "\t\t\t\t\t\t\t</xsd:sequence>\n" +
                        "\t\t\t\t\t\t</xsd:sequence>\n" +
                        "\t\t\t\t\t</xsd:complexType>\n" +
                        "\t\t\t\t</xsd:element>\n" +
                        "\t\t\t\t<xsd:choice minOccurs=\"0\">\n" +
                        "\t\t\t\t\t<xsd:annotation>\n" +
                        "\t\t\t\t\t\t<xsd:documentation>B.4. RACHUNEK OSOBISTY - DO ZWROTU PODATKU LUB NADPŁATY</xsd:documentation>\n" +
                        "\t\t\t\t\t</xsd:annotation>\n" +
                        "\t\t\t\t\t<xsd:element name=\"RachunekBankowy\">\n" +
                        "\t\t\t\t\t\t<xsd:annotation>\n" +
                        "\t\t\t\t\t\t\t<xsd:documentation>Rachunek osobisty - do zwrotu podatku lub nadpłaty. Podanie informacji o rachunku bankowym lub rachunku w spółdzielczej kasie oszczędnościowo–kredytowej nie jest obowiązkowe, jeżeli składający nie wybiera tej formy zwrotu podatku lub nadpłaty. Na wskazany rachunek będą dokonywane ewentualne zwroty nadpłaty lub podatku. Można podać jedynie taki rachunek, którego posiadaczem lub współposiadaczem jest składający. Wpisane niżej dane dotyczące rachunku aktualizują poprzedni stan danych. Zaznaczenie pola Rezygnacja oznacza rezygnację przez składającego z otrzymywania ewentualnego zwrotu nadpłaty lub podatku na rachunek osobisty (również z powodu likwidacji rachunku).</xsd:documentation>\n" +
                        "\t\t\t\t\t\t</xsd:annotation>\n" +
                        "\t\t\t\t\t\t<xsd:complexType>\n" +
                        "\t\t\t\t\t\t\t<xsd:complexContent>\n" +
                        "\t\t\t\t\t\t\t\t<xsd:extension base=\"tns:TRachunekBankowy\">\n" +
                        "\t\t\t\t\t\t\t\t\t<xsd:attribute name=\"typRachunku\" type=\"xsd:string\" use=\"required\" fixed=\"O\">\n" +
                        "\t\t\t\t\t\t\t\t\t\t<xsd:annotation>\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t<xsd:documentation>Rachunek osobisty - do zwrotu podatku lub nadpłaty</xsd:documentation>\n" +
                        "\t\t\t\t\t\t\t\t\t\t</xsd:annotation>\n" +
                        "\t\t\t\t\t\t\t\t\t</xsd:attribute>\n" +
                        "\t\t\t\t\t\t\t\t</xsd:extension>\n" +
                        "\t\t\t\t\t\t\t</xsd:complexContent>\n" +
                        "\t\t\t\t\t\t</xsd:complexType>\n" +
                        "\t\t\t\t\t</xsd:element>\n" +
                        "\t\t\t\t\t<xsd:element name=\"RezygnacjaZRachunkuBankowego\" type=\"tns:TWyborT\">\n" +
                        "\t\t\t\t\t\t<xsd:annotation>\n" +
                        "\t\t\t\t\t\t\t<xsd:documentation>Rezygnacja przez składającego z otrzymywania ewentualnego zwrotu podatku lub nadpłaty na rachunek osobisty (również z powodu likwidacji rachunku): T - tak</xsd:documentation>\n" +
                        "\t\t\t\t\t\t</xsd:annotation>\n" +
                        "\t\t\t\t\t</xsd:element>\n" +
                        "\t\t\t\t</xsd:choice>\n" +
                        "\t\t\t\t<xsd:element name=\"Pouczenie\">\n" +
                        "\t\t\t\t\t<xsd:annotation>\n" +
                        "\t\t\t\t\t\t<xsd:documentation>Wartość 1 oznacza potwierdzenie zapoznania się z treścią i akceptację poniższych informacji:\n" +
                        "Formularz przeznaczony dla osoby fizycznej, spełniającej łącznie poniższe kryteria:\n" +
                        "- ma nadany numer PESEL,\n" +
                        "- nie prowadzi działalności gospodarczej,\n" +
                        "- nie jest zarejestrowanym podatnikiem podatku od towarów i usług,\n" +
                        "- nie jest płatnikiem podatków,\n" +
                        "- nie jest płatnikiem składek na ubezpieczenia społeczne oraz ubezpieczenie zdrowotne.\n" +
                        "Formularz służy do zgłoszenia: aktualnego adresu miejsca zamieszkania (część B.2.), danych kontaktowych (część B.3.) oraz informacji dotyczących rachunku osobistego (część B.4.).\n" +
                        "\t\t\tPodstawa Prawna - Ustawa z dnia 13 października 1995 r. o zasadach ewidencji i identyfikacji podatników i płatników (Dz. U. z 2020 r. poz. 170, z późn. zm.), zgodnie z art. 9 ust. 1d.</xsd:documentation>\n" +
                        "\t\t\t\t\t</xsd:annotation>\n" +
                        "\t\t\t\t\t<xsd:simpleType>\n" +
                        "\t\t\t\t\t\t<xsd:restriction base=\"etd:TKwota2Nieujemna\">\n" +
                        "\t\t\t\t\t\t\t<xsd:minExclusive value=\"0\"/>\n" +
                        "\t\t\t\t\t\t\t<xsd:maxExclusive value=\"2\"/>\n" +
                        "\t\t\t\t\t\t\t<xsd:fractionDigits value=\"0\"/>\n" +
                        "\t\t\t\t\t\t</xsd:restriction>\n" +
                        "\t\t\t\t\t</xsd:simpleType>\n" +
                        "\t\t\t\t</xsd:element>\n" +
                        "\t\t\t</xsd:sequence>\n" +
                        "\t\t</xsd:complexType>\n" +
                        "\t</xsd:element>\n" +
                        "</xsd:schema>".getBytes()).getBytes();
    }

    @Override
    public void deleteFile(String fileName) {
        ;
    }
}
