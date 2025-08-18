package defpackage;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.TotalCaptureResult;
import android.net.Uri;
import android.os.Bundle;
import android.view.Surface;
import androidx.media3.common.ParserException;
import androidx.media3.exoplayer.image.ImageDecoderException;
import java.io.IOException;
import java.util.Collections;
import org.apache.http.util.LangUtils;
import ru.ok.android.externcalls.sdk.analytics.ApplicationNameProvider;
import ru.ok.android.externcalls.sdk.api.CallInfo;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class un0 implements qj3, w56, ApplicationNameProvider, za7, b66, g8b, df9, c7b, ru0, ol0 {
    public final /* synthetic */ int a;

    public /* synthetic */ un0(int i) {
        this.a = i;
    }

    public static Bitmap c(int i, byte[] bArr) throws ImageDecoderException {
        try {
            return c54.q(bArr, i, null);
        } catch (ParserException e) {
            throw new ImageDecoderException("Could not decode image data with BitmapFactory. (data.length = " + bArr.length + ", input length = " + i + ")", e);
        } catch (IOException e2) {
            throw new ImageDecoderException(e2);
        }
    }

    @Override // defpackage.g8b
    public void a(see seeVar) {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(seeVar.b.getWidth(), seeVar.b.getHeight());
        surfaceTexture.detachFromGLContext();
        Surface surface = new Surface(surfaceTexture);
        seeVar.b(surface, ju0.k(), new vx1(surface, 0, surfaceTexture));
    }

    @Override // defpackage.ol0
    public void accept(Object obj, Object obj2) {
    }

    @Override // defpackage.w56, defpackage.b66
    /* renamed from: apply */
    public Object mo131apply(Object obj) {
        switch (this.a) {
            case 4:
                return ((la5) obj).m().getClass().getSimpleName();
            case 8:
                dc1 dc1Var = (dc1) obj;
                return new es1(new dc1(dc1Var.c, dc1Var.a, dc1Var.b));
            case 10:
                return iqd.g(Collections.emptyList());
            default:
                c73 c73Var = (c73) obj;
                c73Var.getClass();
                Bundle bundle = new Bundle();
                y9d y9dVar = c73Var.a;
                if (y9dVar != null) {
                    bundle.putBundle(c73.i, y9dVar.b());
                }
                int i = c73Var.b;
                if (i != -1) {
                    bundle.putInt(c73.j, i);
                }
                int i2 = c73Var.c;
                if (i2 != 0) {
                    bundle.putInt(c73.p, i2);
                }
                int i3 = c73Var.d;
                if (i3 != 0) {
                    bundle.putInt(c73.k, i3);
                }
                CharSequence charSequence = c73Var.f;
                if (charSequence != "") {
                    bundle.putCharSequence(c73.l, charSequence);
                }
                Bundle bundle2 = c73Var.g;
                if (!bundle2.isEmpty()) {
                    bundle.putBundle(c73.m, bundle2);
                }
                Uri uri = c73Var.e;
                if (uri != null) {
                    bundle.putParcelable(c73.o, uri);
                }
                boolean z = c73Var.h;
                if (!z) {
                    bundle.putBoolean(c73.n, z);
                }
                return bundle;
        }
    }

    public boolean b(TotalCaptureResult totalCaptureResult) {
        switch (this.a) {
            case 11:
                return u40.f(totalCaptureResult, false);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return u40.f(totalCaptureResult, false);
            default:
                return u40.f(totalCaptureResult, true);
        }
    }

    @Override // defpackage.ru0
    public su0 g(Bundle bundle) {
        return new h63(bundle.getInt(Integer.toString(0, 36), -1), bundle.getInt(Integer.toString(1, 36), -1), bundle.getInt(Integer.toString(2, 36), -1), bundle.getByteArray(Integer.toString(3, 36)));
    }

    @Override // ru.ok.android.externcalls.sdk.analytics.ApplicationNameProvider
    public String getName() {
        return "";
    }

    @Override // defpackage.za7
    public Object parse(db7 db7Var) {
        return CallInfo.parse(db7Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x016e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.df9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object r(defpackage.gy8 r20) {
        /*
            Method dump skipped, instructions count: 573
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.un0.r(gy8):java.lang.Object");
    }

    @Override // defpackage.c7b
    public boolean test(Object obj) {
        uj3 uj3VarL;
        e52 e52Var = (e52) obj;
        switch (this.a) {
            case 16:
                return (e52Var.M() && (uj3VarL = e52Var.l()) != null && uj3VarL.s()) ? false : true;
            default:
                return e52Var.M();
        }
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        switch (this.a) {
            case 1:
                hm9.p("dq0", "Failed to delete all botCommands", (Throwable) obj);
                break;
            case 2:
                hm9.p("dq0", "Failed to store botCommands", (Throwable) obj);
                break;
            case 5:
                hm9.p("cx0", "onViewCreated: failed", (Throwable) obj);
                break;
            case 9:
                hm9.p("fd1", "loadInternal: failed", (Throwable) obj);
                break;
            case LangUtils.HASH_SEED /* 17 */:
                ((u82) obj).L = 0L;
                break;
            case 18:
                hm9.p("p82", "updateChatLastSearchClickTimeAsync: failed", (Throwable) obj);
                break;
            case 19:
                hm9.p("p82", "error while localRemoveChat", (Throwable) obj);
                break;
            case 20:
                hm9.p("p82", "updateChatWriteTimeAsync: failed", (Throwable) obj);
                break;
            case 21:
                ((u82) obj).m0 = null;
                break;
            case 25:
                ((hl3) obj).j = 2;
                break;
            case 26:
                hm9.p("ContactController", "changeLastSearchClickTimeAsync: failed", (Throwable) obj);
                break;
            case 27:
                hm9.p("ContactController", "changeLastShowingUnknownContactBar: failed", (Throwable) obj);
                break;
            default:
                hm9.p("rr3", "asyncUpdate: exception", (Throwable) obj);
                break;
        }
    }
}
