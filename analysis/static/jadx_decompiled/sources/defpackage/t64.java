package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final /* synthetic */ class t64 implements jm7, km7, ve4, qj3 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object o;

    public /* synthetic */ t64(ed edVar, xn7 xn7Var, pc8 pc8Var, IOException iOException, boolean z) {
        this.o = xn7Var;
        this.X = pc8Var;
        this.b = iOException;
        this.c = z;
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        te0 te0Var = (te0) obj;
        ((jc6) this.o).getClass();
        qv4 qv4Var = (qv4) this.X;
        uv4 uv4Var = qv4Var.a;
        ArrayList arrayList = uv4Var.a;
        ListIterator listIterator = arrayList.listIterator();
        while (true) {
            if (!listIterator.hasNext()) {
                arrayList.add(0, te0Var);
                uv4Var.invalidate();
                break;
            } else if (((nv4) listIterator.next()) instanceof te0) {
                listIterator.set(te0Var);
                uv4Var.invalidate();
                break;
            }
        }
        qv4Var.b();
        if (this.c) {
            qv4Var.a.post(new f5(qv4Var, (ov4) this.b, te0Var, 25));
        }
    }

    @Override // defpackage.jm7, defpackage.km7
    public void invoke(Object obj) {
        Object obj2 = this.X;
        Object obj3 = this.o;
        boolean z = this.c;
        Object obj4 = this.b;
        switch (this.a) {
            case 0:
                ((u65) obj).getClass();
                StringBuilder sb = new StringBuilder("MediaLoadData{dataType=");
                pc8 pc8Var = (pc8) obj2;
                sb.append(pc8Var.a);
                sb.append(", trackType=");
                sb.append(pc8Var.b);
                sb.append(", trackFormat=");
                sb.append((oy5) pc8Var.g);
                sb.append(", trackSelectionReason=");
                sb.append(pc8Var.c);
                sb.append(", trackSelectionData=");
                sb.append(pc8Var.d);
                sb.append(", mediaStartTimeMs=");
                sb.append(pc8Var.e);
                sb.append(", mediaEndTimeMs=");
                String strK = zr6.k(sb, pc8Var.f, "}");
                StringBuilder sb2 = new StringBuilder("LoadEventInfo{loadTaskId");
                xn7 xn7Var = (xn7) obj3;
                sb2.append(xn7Var.a);
                sb2.append(", dataSpec");
                sb2.append(xn7Var.b);
                sb2.append(", uri");
                sb2.append(xn7Var.c);
                sb2.append(", responseHeaders");
                sb2.append(xn7Var.d);
                sb2.append(", elapsedRealtimeMs");
                sb2.append(xn7Var.e);
                sb2.append(", loadDurationMs");
                sb2.append(xn7Var.f);
                sb2.append(", bytesLoaded");
                IOException iOException = (IOException) obj4;
                hm9.r("u65", iOException, "onLoadError, wasCanceled %b, loadEventInfo = %s, mediaLoadData = %s", Boolean.valueOf(z), zr6.k(sb2, xn7Var.g, "}"), strK);
                break;
            default:
                ((gd) obj).R((fd) obj3, (pc8) obj2, (IOException) obj4, z);
                break;
        }
    }

    @Override // defpackage.ve4
    public ffc k(int i, rze rzeVar, int[] iArr) {
        cf4 cf4Var = (cf4) this.o;
        cf4Var.getClass();
        ge4 ge4Var = new ge4(0, cf4Var);
        int i2 = ((int[]) this.b)[i];
        ww6 ww6VarI = zw6.i();
        for (int i3 = 0; i3 < rzeVar.a; i3++) {
            ww6VarI.a(new ie4(i, rzeVar, i3, (oe4) this.X, iArr[i3], this.c, ge4Var, i2));
        }
        return ww6VarI.j();
    }

    public /* synthetic */ t64(fd fdVar, yn7 yn7Var, pc8 pc8Var, IOException iOException, boolean z) {
        this.o = fdVar;
        this.X = pc8Var;
        this.b = iOException;
        this.c = z;
    }

    public /* synthetic */ t64(cf4 cf4Var, oe4 oe4Var, boolean z, int[] iArr) {
        this.o = cf4Var;
        this.X = oe4Var;
        this.c = z;
        this.b = iArr;
    }

    public /* synthetic */ t64(jc6 jc6Var, qv4 qv4Var, ov4 ov4Var, boolean z) {
        this.o = jc6Var;
        this.X = qv4Var;
        this.b = ov4Var;
        this.c = z;
    }
}
