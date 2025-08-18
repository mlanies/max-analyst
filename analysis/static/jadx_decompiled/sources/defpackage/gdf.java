package defpackage;

import android.graphics.Rect;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import one.me.messages.list.loader.MessageModel;

/* loaded from: classes2.dex */
public final class gdf extends tdc {
    public final long a;
    public final m29 b;
    public final m56 c;
    public final a66 d;
    public RecyclerView f;
    public final je7 g;
    public final je7 h;
    public final je7 i;
    public final je7 j;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final float q;
    public boolean r;
    public final id2 s;
    public final String e = gdf.class.getName();
    public final Rect k = new Rect();
    public final gi9 l = new gi9((Object) null);
    public final gi9 m = new gi9((Object) null);

    /* JADX WARN: Removed duplicated region for block: B:9:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public gdf(defpackage.je7 r15, defpackage.je7 r16, defpackage.w80 r17, defpackage.je7 r18, defpackage.je7 r19, long r20, defpackage.m29 r22, defpackage.o59 r23, defpackage.v59 r24, defpackage.pg7 r25) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gdf.<init>(je7, je7, w80, je7, je7, long, m29, o59, v59, pg7):void");
    }

    @Override // defpackage.tdc
    public final void a(RecyclerView recyclerView, int i) {
        if (i != 0) {
            return;
        }
        e(recyclerView, false);
    }

    @Override // defpackage.tdc
    public final void b(RecyclerView recyclerView, int i, int i2) {
        tz tzVar;
        this.f = recyclerView;
        if (this.n) {
            LinearLayoutManager linearLayoutManagerT = z7.t(recyclerView);
            int iW0 = linearLayoutManagerT != null ? linearLayoutManagerT.W0() : -1;
            int iY0 = linearLayoutManagerT != null ? linearLayoutManagerT.Y0() : -1;
            if (iW0 == -1 || iY0 == -1) {
                String str = this.e;
                ir6 ir6Var = hm9.m;
                if (ir6Var != null && ir6Var.c()) {
                    ir6Var.d(us7.X, str, wg0.h("Player autoplay. Can't start fetch because invalid positions, first:", iW0, ", last:", iY0, "."), null);
                    return;
                }
                return;
            }
            if (iW0 <= iY0) {
                int i3 = iW0;
                while (true) {
                    dec decVarM = recyclerView.M(i3);
                    if (decVarM == null) {
                        String str2 = this.e;
                        ir6 ir6Var2 = hm9.m;
                        if (ir6Var2 != null && ir6Var2.c()) {
                            us7 us7Var = us7.X;
                            StringBuilder sbJ = wg0.j("Player autoplay. Can't find viewHolder for fetch, pos:", i3, ", firstPos:", iW0, "|lastPos:");
                            sbJ.append(iY0);
                            ir6Var2.d(us7Var, str2, sbJ.toString(), null);
                        }
                    } else if (decVarM instanceof ht8) {
                        ht8 ht8Var = (ht8) decVarM;
                        if (ht8Var.I0 instanceof cmf) {
                            MessageModel messageModelD = this.b.d(ht8Var.J0);
                            o00 o00Var = (messageModelD == null || (tzVar = messageModelD.u0) == null) ? null : tzVar.d;
                            zcf zcfVar = o00Var instanceof zcf ? (zcf) o00Var : null;
                            if (zcfVar != null) {
                                if (zcfVar instanceof wgf) {
                                    this.m.a(((wgf) zcfVar).a);
                                } else {
                                    this.l.a(zcfVar.j());
                                }
                            }
                        }
                    }
                    if (i3 == iY0) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            if (this.m.j()) {
                vhf vhfVar = (vhf) this.j.getValue();
                long j = this.a;
                List listD = oag.D(this.m);
                vhfVar.getClass();
                ArrayList arrayList = new ArrayList();
                for (Object obj : listD) {
                    if (vhfVar.i.add(vhf.c(j, ((Number) obj).longValue()))) {
                        arrayList.add(obj);
                    }
                }
                if (!arrayList.isEmpty()) {
                    j47.T(vhfVar.h, null, null, new rhf(vhfVar, listD, arrayList, j, null), 3);
                }
                this.m.c();
            }
            if (this.l.j()) {
                rff rffVar = (rff) this.h.getValue();
                List listD2 = oag.D(this.l);
                long j2 = this.a;
                rffVar.getClass();
                j47.T(rffVar.m, null, null, new off(listD2, rffVar, j2, null), 3);
                this.l.c();
            }
        }
    }

    public final void c() {
        String str = this.e;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str, "Player autoplay. onMediaProcessingStarted.", null);
        }
        this.r = true;
        if (((n4b) this.i.getValue()).a) {
            return;
        }
        this.s.j(-1);
    }

    public final void d(cmf cmfVar, final fdf fdfVar, o00 o00Var, MessageModel messageModel, final dkf dkfVar, final gef gefVar) {
        cmfVar.o(fdfVar, o00Var, messageModel.a, (messageModel.w0 == null && messageModel.x0 == null && (messageModel.F0 == null || (messageModel.I0 & (-2080374787)) == 0)) ? false : true, true);
        cmfVar.setVideoClickListener(new a66() { // from class: adf
            @Override // defpackage.a66
            public final Object invoke(Object obj, Object obj2) {
                Object cdfVar;
                cmf cmfVar2;
                gdf gdfVar = this.a;
                fdf fdfVar2 = fdfVar;
                dkf dkfVar2 = dkfVar;
                gef gefVar2 = gefVar;
                o00 o00Var2 = (o00) obj;
                long jLongValue = ((Long) obj2).longValue();
                String str = fdfVar2.a;
                if (o00Var2 instanceof wgf) {
                    String str2 = gdfVar.e;
                    ir6 ir6Var = hm9.m;
                    if (ir6Var != null && ir6Var.c()) {
                        us7 us7Var = us7.X;
                        int iG = gdfVar.s.g();
                        boolean zB = dkfVar2.b();
                        StringBuilder sbJ = z7b.j("Player autoplay. stop autoplay to start a video message, \n                                |msgId:", jLongValue, ", \n                                |attachId:", str);
                        sbJ.append("\n                                |states count:");
                        sbJ.append(iG);
                        sbJ.append("\n                                |playing:");
                        sbJ.append(zB);
                        ir6Var.d(us7Var, str2, x9e.c0(sbJ.toString()), null);
                    }
                    hm9.n(dkfVar2.c, "Player. Clear");
                    u75 u75Var = dkfVar2.o;
                    u75Var.w2();
                    u75Var.p2(null);
                    u75Var.k2(0, 0);
                    dkfVar2.Y = null;
                    dkfVar2.Z = null;
                    ((f4b) gdfVar.g.getValue()).a(dkfVar2);
                    fdf fdfVar3 = (fdf) gdfVar.s.e(str);
                    if (fdfVar3 != null && (cmfVar2 = (cmf) fdfVar3.Y.get()) != null) {
                        cmfVar2.u();
                    }
                    cdfVar = new ddf(jLongValue, (wgf) o00Var2);
                } else {
                    cdfVar = new cdf(jLongValue, str, o00Var2, dkfVar2.F0(), o00Var2 instanceof vqd ? 0L : dkfVar2.G0(), gefVar2.c0());
                }
                gdfVar.c.invoke(cdfVar);
                return e5f.a;
            }
        });
        cmfVar.setVideoLongClickListener(new bk(22, this));
        dkfVar.L0(true);
        dkfVar.g(0.0f);
        dkfVar.I0(gefVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0316 A[PHI: r0 r18 r31
      0x0316: PHI (r0v24 gdf) = (r0v8 gdf), (r0v8 gdf), (r0v25 gdf) binds: [B:182:0x04ea, B:185:0x04f2, B:118:0x0314] A[DONT_GENERATE, DONT_INLINE]
      0x0316: PHI (r18v2 int) = (r18v1 int), (r18v1 int), (r18v3 int) binds: [B:182:0x04ea, B:185:0x04f2, B:118:0x0314] A[DONT_GENERATE, DONT_INLINE]
      0x0316: PHI (r31v1 boolean) = (r31v0 boolean), (r31v0 boolean), (r31v2 boolean) binds: [B:182:0x04ea, B:185:0x04f2, B:118:0x0314] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(androidx.recyclerview.widget.RecyclerView r42, boolean r43) {
        /*
            Method dump skipped, instructions count: 1365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gdf.e(androidx.recyclerview.widget.RecyclerView, boolean):void");
    }
}
