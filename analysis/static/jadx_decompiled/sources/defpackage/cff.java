package defpackage;

import android.util.Range;
import android.util.Size;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class cff implements mde {
    public static final Size Z = new Size(1280, 720);
    public static final Range s0 = new Range(1, 60);
    public final eu4 X;
    public final Range Y;
    public final String a;
    public final bue b;
    public final mc0 c;
    public final Size o;

    public cff(String str, bue bueVar, mc0 mc0Var, Size size, eu4 eu4Var, Range range) {
        this.a = str;
        this.b = bueVar;
        this.c = mc0Var;
        this.o = size;
        this.X = eu4Var;
        this.Y = range;
    }

    @Override // defpackage.mde
    public final Object get() {
        Integer num;
        Range range = see.p;
        Range range2 = this.Y;
        int iIntValue = !Objects.equals(range2, range) ? ((Integer) s0.clamp((Integer) range2.getUpper())).intValue() : 30;
        Integer numValueOf = Integer.valueOf(iIntValue);
        boolean zEquals = Objects.equals(range2, range);
        Object obj = range2;
        if (!zEquals) {
            obj = "<UNSPECIFIED>";
        }
        String.format("Default resolved frame rate: %dfps. [Expected operating range: %s]", numValueOf, obj);
        Range range3 = this.c.c;
        eu4 eu4Var = this.X;
        int i = eu4Var.b;
        Size size = this.o;
        int width = size.getWidth();
        Size size2 = Z;
        int iC = eef.c(14000000, i, 8, iIntValue, 30, width, size2.getWidth(), size.getHeight(), size2.getHeight(), range3);
        HashMap map = hu4.e;
        String str = this.a;
        Map map2 = (Map) map.get(str);
        int iIntValue2 = (map2 == null || (num = (Integer) map2.get(eu4Var)) == null) ? -1 : num.intValue();
        jc0 jc0VarA = eef.a(iIntValue2, str);
        qp4 qp4VarD = ic0.d();
        if (str == null) {
            throw new NullPointerException("Null mimeType");
        }
        qp4VarD.a = str;
        bue bueVar = this.b;
        if (bueVar == null) {
            throw new NullPointerException("Null inputTimebase");
        }
        qp4VarD.c = bueVar;
        qp4VarD.o = size;
        qp4VarD.t0 = Integer.valueOf(iC);
        qp4VarD.Z = Integer.valueOf(iIntValue);
        qp4VarD.b = Integer.valueOf(iIntValue2);
        qp4VarD.Y = jc0VarA;
        return qp4VarD.b();
    }
}
