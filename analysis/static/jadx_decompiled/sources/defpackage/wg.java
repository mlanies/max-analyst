package defpackage;

import android.content.Context;
import android.content.res.XmlResourceParser;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class wg extends dle {
    public static final wg X = new wg(vg.DURATION, 300L, 0);
    public static final wg Y = new wg(vg.PATH_DATA, "", 1);
    public static final wg Z = new wg(vg.PROPERTY_NAME, "", 2);
    public static final wg s0 = new wg(vg.PROPERTY_X_NAME, "", 3);
    public static final wg t0 = new wg(vg.PROPERTY_Y_NAME, "", 4);
    public static final wg u0 = new wg(vg.REPEAT_COUNT, 0, 5);
    public static final wg v0 = new wg(vg.REPEAT_MODE, 1, 6);
    public static final wg w0 = new wg(vg.START_OFFSET, 0L, 7);
    public static final wg x0 = new wg(vg.VALUE_TYPE, new ih(0.0f), 8);
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wg(vg vgVar, Object obj, int i) {
        super(vgVar, 1, obj);
        this.o = i;
    }

    @Override // defpackage.dle
    public final Object z(Context context, XmlResourceParser xmlResourceParser, int i) {
        Integer num;
        switch (this.o) {
            case 0:
                Long lF0 = dae.f0(xmlResourceParser.getAttributeValue(i));
                return Long.valueOf(lF0 != null ? lF0.longValue() : 0L);
            case 1:
                return xmlResourceParser.getAttributeValue(i);
            case 2:
                return xmlResourceParser.getAttributeValue(i);
            case 3:
                return xmlResourceParser.getAttributeValue(i);
            case 4:
                return xmlResourceParser.getAttributeValue(i);
            case 5:
                return Integer.valueOf(Integer.parseInt(xmlResourceParser.getAttributeValue(i)));
            case 6:
                return Integer.valueOf(Integer.parseInt(xmlResourceParser.getAttributeValue(i)));
            case 7:
                return Long.valueOf(Long.parseLong(xmlResourceParser.getAttributeValue(i)));
            default:
                Iterator it = y53.M(vg.VALUE_FROM, vg.VALUE_TO).iterator();
                while (true) {
                    if (it.hasNext()) {
                        num = (Integer) s36.d(xmlResourceParser).get(((vg) it.next()).a);
                        if (num != null) {
                        }
                    } else {
                        num = null;
                    }
                }
                String attributeValue = num != null ? xmlResourceParser.getAttributeValue(num.intValue()) : null;
                int i2 = (attributeValue == null || !w9e.S0(attributeValue, '#')) ? Integer.parseInt(xmlResourceParser.getAttributeValue(i)) : 3;
                if (i2 == 0) {
                    return new ih(0.0f);
                }
                if (i2 == 1) {
                    return new jh(0);
                }
                if (i2 == 2) {
                    return new kh("");
                }
                if (i2 == 3) {
                    return new hh(0);
                }
                if (i2 == 4) {
                    return lh.a;
                }
                throw new IllegalStateException(wg0.i("unknown value type ", xmlResourceParser.getAttributeValue(i)));
        }
    }
}
