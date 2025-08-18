package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class de2 extends gle {
    public int X;
    public long Y;
    public long Z;
    public ArrayList c;
    public int o;

    public de2(gy8 gy8Var) {
        super(gy8Var);
        if (this.c == null) {
            this.c = new ArrayList();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // defpackage.gle
    public final void b(gy8 gy8Var, String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -677145915:
                    if (str.equals("forward")) {
                        this.Y = gy8Var.w0();
                        return;
                    }
                    break;
                case -462094004:
                    if (str.equals("messages")) {
                        this.c = wz.e(gy8Var);
                        return;
                    }
                    break;
                case 111188:
                    if (str.equals("pos")) {
                        this.o = gy8Var.v0();
                        return;
                    }
                    break;
                case 110549828:
                    if (str.equals("total")) {
                        this.X = gy8Var.v0();
                        return;
                    }
                    break;
                case 2121976803:
                    if (str.equals("backward")) {
                        this.Z = gy8Var.w0();
                        return;
                    }
                    break;
            }
        }
        gy8Var.z();
    }

    public final List c() {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            arrayList = null;
        }
        return x53.D0(arrayList);
    }

    @Override // defpackage.zje
    public final String toString() {
        int size = c().size();
        int i = this.o;
        int i2 = this.X;
        long j = this.Y;
        long j2 = this.Z;
        StringBuilder sbJ = wg0.j("{messages=", size, ", pos=", i, ", total=");
        sbJ.append(i2);
        sbJ.append(", forward=");
        sbJ.append(j);
        sbJ.append(", backward=");
        sbJ.append(j2);
        sbJ.append("}");
        return sbJ.toString();
    }
}
