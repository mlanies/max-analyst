package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.io.File;
import kotlin.coroutines.Continuation;
import ru.ok.messages.views.ActAvatarCrop;

/* loaded from: classes2.dex */
public final class io9 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ mo9 Z;
    public final /* synthetic */ Uri s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public io9(mo9 mo9Var, Uri uri, Continuation continuation) {
        super(2, continuation);
        this.Z = mo9Var;
        this.s0 = uri;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((io9) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        io9 io9Var = new io9(this.Z, this.s0, continuation);
        io9Var.Y = obj;
        return io9Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object njcVar;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            sx3 sx3Var = (sx3) this.Y;
            File fileQ = ((kk5) this.Z.b.getValue()).q(this.Z.k);
            Uri uri = this.s0;
            mo9 mo9Var = this.Z;
            try {
                if (!fileQ.exists() && uri != null) {
                    s5c.I(((Context) mo9Var.c.getValue()).getContentResolver().openInputStream(uri), fileQ);
                }
                njcVar = e5fVar;
            } catch (Throwable th) {
                njcVar = new njc(th);
            }
            mo9 mo9Var2 = this.Z;
            Throwable thA = pjc.a(njcVar);
            if (thA != null) {
                hm9.p(sx3Var.getClass().getName(), "failed to copy picked image, e:", thA);
                mo9Var2.b();
            }
            y7d y7dVar = (y7d) this.Z.d.getValue();
            String absolutePath = fileQ.getAbsolutePath();
            j47.c0(y7dVar, absolutePath, absolutePath);
            j47.a0((y7d) this.Z.d.getValue(), fileQ.getAbsolutePath());
            Intent intent = new Intent((Context) this.Z.c.getValue(), (Class<?>) ActAvatarCrop.class);
            intent.putExtra("ru.ok.tamtam.extra.URI", Uri.fromFile(fileQ));
            intent.putExtra("ru.ok.tamtam.extra.FILE_PATH", fileQ.getAbsolutePath());
            intent.putExtra("ru.ok.tamtam.extra.SHOW_RECAPTURE", true);
            intent.putExtra("ru.ok.tamtam.extra.FOR_CHAT_BACKGROUND", false);
            kld kldVar = this.Z.g;
            dd0 dd0Var = new dd0(intent);
            this.X = 1;
            if (kldVar.a(dd0Var, this) == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5fVar;
    }
}
