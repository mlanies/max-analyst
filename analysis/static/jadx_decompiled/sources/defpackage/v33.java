package defpackage;

import android.content.res.XmlResourceParser;
import one.me.sdk.richvector.internal.element.ClipPathElement;
import one.me.sdk.richvector.internal.element.GroupElement;
import one.me.sdk.richvector.internal.element.Shape;

/* loaded from: classes2.dex */
public final class v33 extends ju0 {
    public ClipPathElement L(XmlResourceParser xmlResourceParser) {
        int iA = ju0.a(this, xmlResourceParser, "name");
        String attributeValue = ju0.c(this, iA) ? xmlResourceParser.getAttributeValue(iA) : null;
        int iA2 = ju0.a(this, xmlResourceParser, "pathData");
        return new ClipPathElement(attributeValue, ju0.c(this, iA2) ? xmlResourceParser.getAttributeValue(iA2) : null);
    }

    public GroupElement M(XmlResourceParser xmlResourceParser) {
        int iA = ju0.a(this, xmlResourceParser, "name");
        String attributeValue = ju0.c(this, iA) ? xmlResourceParser.getAttributeValue(iA) : null;
        int iA2 = ju0.a(this, xmlResourceParser, "pivotX");
        float fFloatValue = (ju0.c(this, iA2) ? Float.valueOf(Float.parseFloat(xmlResourceParser.getAttributeValue(iA2))) : Float.valueOf(0.0f)).floatValue();
        int iA3 = ju0.a(this, xmlResourceParser, "pivotY");
        float fFloatValue2 = (ju0.c(this, iA3) ? Float.valueOf(Float.parseFloat(xmlResourceParser.getAttributeValue(iA3))) : Float.valueOf(0.0f)).floatValue();
        int iA4 = ju0.a(this, xmlResourceParser, "rotation");
        float fFloatValue3 = (ju0.c(this, iA4) ? Float.valueOf(Float.parseFloat(xmlResourceParser.getAttributeValue(iA4))) : Float.valueOf(0.0f)).floatValue();
        int iA5 = ju0.a(this, xmlResourceParser, "scaleX");
        float fFloatValue4 = (ju0.c(this, iA5) ? Float.valueOf(Float.parseFloat(xmlResourceParser.getAttributeValue(iA5))) : Float.valueOf(1.0f)).floatValue();
        int iA6 = ju0.a(this, xmlResourceParser, "scaleY");
        float fFloatValue5 = (ju0.c(this, iA6) ? Float.valueOf(Float.parseFloat(xmlResourceParser.getAttributeValue(iA6))) : Float.valueOf(1.0f)).floatValue();
        int iA7 = ju0.a(this, xmlResourceParser, "translateX");
        float fFloatValue6 = (ju0.c(this, iA7) ? Float.valueOf(Float.parseFloat(xmlResourceParser.getAttributeValue(iA7))) : Float.valueOf(0.0f)).floatValue();
        int iA8 = ju0.a(this, xmlResourceParser, "translateY");
        return new GroupElement(attributeValue, fFloatValue, fFloatValue2, fFloatValue3, fFloatValue4, fFloatValue5, fFloatValue6, (ju0.c(this, iA8) ? Float.valueOf(Float.parseFloat(xmlResourceParser.getAttributeValue(iA8))) : Float.valueOf(0.0f)).floatValue(), null, null, 768, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public one.me.sdk.richvector.internal.element.PathElement N(android.content.res.XmlResourceParser r21) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v33.N(android.content.res.XmlResourceParser):one.me.sdk.richvector.internal.element.PathElement");
    }

    public Shape O(XmlResourceParser xmlResourceParser) {
        Float fValueOf;
        Float fValueOf2;
        int iA = ju0.a(this, xmlResourceParser, "viewportWidth");
        float fFloatValue = (ju0.c(this, iA) ? Float.valueOf(Float.parseFloat(xmlResourceParser.getAttributeValue(iA))) : Float.valueOf(0.0f)).floatValue();
        int iA2 = ju0.a(this, xmlResourceParser, "viewportHeight");
        float fFloatValue2 = (ju0.c(this, iA2) ? Float.valueOf(Float.parseFloat(xmlResourceParser.getAttributeValue(iA2))) : Float.valueOf(0.0f)).floatValue();
        int iA3 = ju0.a(this, xmlResourceParser, "alpha");
        int iMin = Math.min(255, (int) (255 * (ju0.c(this, iA3) ? Float.valueOf(Float.parseFloat(xmlResourceParser.getAttributeValue(iA3))) : Float.valueOf(1.0f)).floatValue()));
        int iA4 = ju0.a(this, xmlResourceParser, "name");
        String attributeValue = ju0.c(this, iA4) ? xmlResourceParser.getAttributeValue(iA4) : null;
        int iA5 = ju0.a(this, xmlResourceParser, "width");
        if (ju0.c(this, iA5)) {
            String attributeValue2 = xmlResourceParser.getAttributeValue(iA5);
            fValueOf = Float.valueOf(Float.parseFloat(attributeValue2.substring(0, attributeValue2.length() - (attributeValue2.endsWith("dip") ? 3 : 2))));
        } else {
            fValueOf = Float.valueOf(0.0f);
        }
        float fFloatValue3 = fValueOf.floatValue();
        int iA6 = ju0.a(this, xmlResourceParser, "height");
        if (ju0.c(this, iA6)) {
            String attributeValue3 = xmlResourceParser.getAttributeValue(iA6);
            fValueOf2 = Float.valueOf(Float.parseFloat(attributeValue3.substring(0, attributeValue3.length() - (attributeValue3.endsWith("dip") ? 3 : 2))));
        } else {
            fValueOf2 = Float.valueOf(0.0f);
        }
        return new Shape(attributeValue, fFloatValue, fFloatValue2, iMin, fFloatValue3, fValueOf2.floatValue(), null, 64, null);
    }
}
