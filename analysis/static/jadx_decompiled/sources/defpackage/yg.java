package defpackage;

import android.content.Context;
import android.content.res.XmlResourceParser;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public abstract class yg extends dle {
    @Override // defpackage.dle
    public final Object z(Context context, XmlResourceParser xmlResourceParser, int i) throws NumberFormatException {
        float fA;
        Object hhVar = (mh) wg.x0.C(context, xmlResourceParser);
        if (!(hhVar instanceof hh) && w9e.S0(xmlResourceParser.getAttributeValue(i), '#')) {
            hhVar = new hh(0);
        }
        if (hhVar instanceof hh) {
            return new hh(s36.x(xmlResourceParser.getAttributeValue(i)));
        }
        if (hhVar instanceof ih) {
            String attributeValue = xmlResourceParser.getAttributeValue(i);
            try {
                fA = dk4.a(context, attributeValue);
            } catch (NumberFormatException unused) {
                fA = Float.parseFloat(attributeValue);
            }
            return new ih(fA);
        }
        if (hhVar instanceof jh) {
            return new jh(Integer.parseInt(xmlResourceParser.getAttributeValue(i)));
        }
        if (hhVar instanceof kh) {
            return new kh(xmlResourceParser.getAttributeValue(i));
        }
        if (tpa.f(hhVar, lh.a)) {
            throw new IllegalStateException(zr6.i("Undefined ", ((vg) this.b).a, " type"));
        }
        throw new NoWhenBranchMatchedException();
    }
}
