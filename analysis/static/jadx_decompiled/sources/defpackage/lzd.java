package defpackage;

import android.net.Uri;
import android.util.Size;
import androidx.fragment.app.a;
import androidx.fragment.app.b;
import java.io.File;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class lzd extends ffe implements a66 {
    public b X;
    public int Y;
    public final /* synthetic */ a Z;
    public final /* synthetic */ mzd s0;
    public final /* synthetic */ String t0;
    public final /* synthetic */ kke u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lzd(a aVar, mzd mzdVar, String str, w9a w9aVar, Continuation continuation) {
        super(2, continuation);
        this.Z = aVar;
        this.s0 = mzdVar;
        this.t0 = str;
        this.u0 = w9aVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((lzd) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new lzd(this.Z, this.s0, this.t0, (w9a) this.u0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        b bVar;
        File fileO;
        mzd mzdVar = this.s0;
        tx3 tx3Var = tx3.a;
        int i = this.Y;
        if (i == 0) {
            od2.a0(obj);
            a aVar = this.Z;
            b bVarS0 = aVar.S0();
            try {
                kk5 kk5Var = mzdVar.a;
                try {
                    kk5Var.getClass();
                    fileO = kk5Var.o(null, null);
                    String name = fileO.getName();
                    Uri uriN = j47.N(this.t0);
                    try {
                        int i2 = c37.h;
                        File fileQ = ((y8a) vl.b()).h().q(name);
                        if (!fileQ.exists() && uriN != null) {
                            s5c.I(bVarS0.getContentResolver().openInputStream(uriN), fileQ);
                        }
                    } catch (Exception e) {
                        e = e;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
                try {
                    mzdVar.b.getClass();
                    Size sizeI = ti4.i(bVarS0);
                    int iMin = Math.min(Math.max(sizeI.getWidth(), sizeI.getHeight()), 2048);
                    String absolutePath = fileO.getAbsolutePath();
                    j47.d0(absolutePath, absolutePath, iMin, iMin, 100);
                    j47.a0(mzdVar.c, absolutePath);
                    Uri uriFromFile = Uri.fromFile(fileO);
                    cx7 cx7VarC = ((w9a) this.u0).c();
                    kzd kzdVar = new kzd(aVar, uriFromFile, absolutePath, null);
                    this.X = bVarS0;
                    this.Y = 1;
                    if (j47.t0(cx7VarC, kzdVar, this) == tx3Var) {
                        return tx3Var;
                    }
                } catch (Exception e3) {
                    e = e3;
                    e = e;
                    bVar = bVarS0;
                    hm9.p(mzd.d, "startCropImageAsChatBackgroundUseCase: ", e);
                    a14.K(bVar, jpc.P2);
                    return e5f.a;
                }
            } catch (Exception e4) {
                e = e4;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar = this.X;
            try {
                od2.a0(obj);
            } catch (Exception e5) {
                e = e5;
                hm9.p(mzd.d, "startCropImageAsChatBackgroundUseCase: ", e);
                a14.K(bVar, jpc.P2);
                return e5f.a;
            }
        }
        return e5f.a;
    }
}
