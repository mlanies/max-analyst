package defpackage;

import android.os.Handler;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final class vag implements uoc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vag(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.uoc
    public final void a(e24 e24Var, byte[] bArr, int i) {
        vbg vbgVar;
        switch (this.a) {
            case 0:
                ((Handler) ((qp4) this.b).X).post(new t05(this, e24Var, bArr, i, 5));
                break;
            case 1:
                c8d c8dVar = (c8d) this.b;
                o9g o9gVar = (o9g) c8dVar.c;
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                byteBufferWrap.get();
                byteBufferWrap.get();
                byteBufferWrap.getShort();
                int i2 = byteBufferWrap.getInt() & 268435455;
                byteBufferWrap.getInt();
                byteBufferWrap.getInt();
                String string = StandardCharsets.UTF_8.decode(byteBufferWrap.slice()).toString();
                o9gVar.C(i2);
                st stVar = new st(o9gVar.C(i2), string);
                Iterator it = ((CopyOnWriteArrayList) c8dVar.o).iterator();
                while (it.hasNext()) {
                    ((xx0) it.next()).a.W1.o.onAsrDataPackage(stVar);
                }
                break;
            case 2:
                ((koc) this.b).f.post(new t05(this, e24Var, bArr, i, 6));
                break;
            default:
                bwc bwcVar = (bwc) this.b;
                if (!bwcVar.f) {
                    xag xagVar = new xag(bArr);
                    bg1 bg1VarC = bwcVar.c.C(xagVar.d);
                    if (bg1VarC != null) {
                        vbg vbgVar2 = null;
                        if (!bwcVar.f) {
                            if (bwcVar.a.get(bg1VarC) != null) {
                                vbgVar2 = (vbg) bwcVar.a.get(bg1VarC);
                            } else {
                                if (bwcVar.h == null ? true : bwcVar.h.contains(bg1VarC)) {
                                    bwcVar.a.put(bg1VarC, new vbg(bwcVar.b, bwcVar.i, new ypc(bwcVar, 3, bg1VarC)));
                                    vbgVar2 = (vbg) bwcVar.a.get(bg1VarC);
                                }
                            }
                        }
                        if (vbgVar2 != null) {
                            vbgVar2.e.post(new ibg(vbgVar2, 1, xagVar));
                        }
                        if (((xagVar.a & 8) != 0) && (vbgVar = (vbg) bwcVar.a.get(bg1VarC)) != null) {
                            vbgVar.a();
                            bwcVar.a.remove(bg1VarC);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
