package defpackage;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes.dex */
public final class fff implements dff {
    public final dff a;
    public final Range b;
    public final Range c;
    public final HashSet o;

    public fff(dff dffVar) {
        HashSet hashSet = new HashSet();
        this.o = hashSet;
        this.a = dffVar;
        int iA1 = dffVar.a1();
        this.b = Range.create(Integer.valueOf(iA1), Integer.valueOf(((int) Math.ceil(4096.0d / iA1)) * iA1));
        int iW1 = dffVar.w1();
        this.c = Range.create(Integer.valueOf(iW1), Integer.valueOf(((int) Math.ceil(2160.0d / iW1)) * iW1));
        List list = MediaCodecInfoReportIncorrectInfoQuirk.a;
        hashSet.addAll(MediaCodecInfoReportIncorrectInfoQuirk.a.contains(Build.MODEL.toLowerCase(Locale.US)) ? Collections.singleton(new Size(1920, 1080)) : Collections.emptySet());
    }

    public static dff a(dff dffVar, Size size) {
        if (!(dffVar instanceof fff)) {
            if (xi4.a.e(MediaCodecInfoReportIncorrectInfoQuirk.class) != null) {
                dffVar = new fff(dffVar);
            } else if (size != null && !dffVar.Q0(size.getWidth(), size.getHeight())) {
                Range rangeX1 = dffVar.x1();
                Range rangeE1 = dffVar.E1();
                size.toString();
                Objects.toString(rangeX1);
                Objects.toString(rangeE1);
                dffVar = new fff(dffVar);
            }
        }
        if (size != null && (dffVar instanceof fff)) {
            ((fff) dffVar).o.add(size);
        }
        return dffVar;
    }

    @Override // defpackage.dff
    public final boolean A1(int i, int i2) {
        dff dffVar = this.a;
        if (dffVar.A1(i, i2)) {
            return true;
        }
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (size.getWidth() == i && size.getHeight() == i2) {
                return true;
            }
        }
        if (this.b.contains((Range) Integer.valueOf(i))) {
            if (this.c.contains((Range) Integer.valueOf(i2)) && i % dffVar.a1() == 0 && i2 % dffVar.w1() == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dff
    public final Range E1() {
        return this.c;
    }

    @Override // defpackage.dff
    public final int a1() {
        return this.a.a1();
    }

    @Override // defpackage.dff
    public final Range b1() {
        return this.a.b1();
    }

    @Override // defpackage.dff
    public final boolean h1() {
        return this.a.h1();
    }

    @Override // defpackage.dff
    public final Range r1(int i) {
        Integer numValueOf = Integer.valueOf(i);
        Range range = this.c;
        boolean zContains = range.contains((Range) numValueOf);
        dff dffVar = this.a;
        c54.j("Not supported height: " + i + " which is not in " + range + " or can not be divided by alignment " + dffVar.w1(), zContains && i % dffVar.w1() == 0);
        return this.b;
    }

    @Override // defpackage.dff
    public final Range v1(int i) {
        Integer numValueOf = Integer.valueOf(i);
        Range range = this.b;
        boolean zContains = range.contains((Range) numValueOf);
        dff dffVar = this.a;
        c54.j("Not supported width: " + i + " which is not in " + range + " or can not be divided by alignment " + dffVar.a1(), zContains && i % dffVar.a1() == 0);
        return this.c;
    }

    @Override // defpackage.dff
    public final int w1() {
        return this.a.w1();
    }

    @Override // defpackage.dff
    public final Range x1() {
        return this.b;
    }
}
