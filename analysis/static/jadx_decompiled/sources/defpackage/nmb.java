package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.io.File;
import kotlin.coroutines.Continuation;
import ru.ok.messages.views.ActAvatarCrop;

/* loaded from: classes2.dex */
public final class nmb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ cnb Y;
    public final /* synthetic */ Uri Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nmb(cnb cnbVar, Uri uri, Continuation continuation) {
        super(2, continuation);
        this.Y = cnbVar;
        this.Z = uri;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        nmb nmbVar = (nmb) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        nmbVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        nmb nmbVar = new nmb(this.Y, this.Z, continuation);
        nmbVar.X = obj;
        return nmbVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object njcVar;
        Uri uri;
        e5f e5fVar = e5f.a;
        od2.a0(obj);
        sx3 sx3Var = (sx3) this.X;
        bc7[] bc7VarArr = cnb.S0;
        cnb cnbVar = this.Y;
        je7 je7Var = cnbVar.v0;
        Context context = cnbVar.Q0;
        File fileQ = ((kk5) je7Var.getValue()).q((String) cnbVar.P0.get());
        try {
            if (!fileQ.exists() && (uri = this.Z) != null) {
                s5c.I(context.getContentResolver().openInputStream(uri), fileQ);
            }
            njcVar = e5fVar;
        } catch (Throwable th) {
            njcVar = new njc(th);
        }
        Throwable thA = pjc.a(njcVar);
        if (thA != null) {
            hm9.p(sx3Var.getClass().getName(), "failed to copy picked image, e:", thA);
            cnbVar.D();
        }
        je7 je7Var2 = cnbVar.u0;
        y7d y7dVar = (y7d) je7Var2.getValue();
        String absolutePath = fileQ.getAbsolutePath();
        j47.c0(y7dVar, absolutePath, absolutePath);
        j47.a0((y7d) je7Var2.getValue(), fileQ.getAbsolutePath());
        Intent intent = new Intent(context, (Class<?>) ActAvatarCrop.class);
        intent.putExtra("ru.ok.tamtam.extra.URI", Uri.fromFile(fileQ));
        intent.putExtra("ru.ok.tamtam.extra.FILE_PATH", fileQ.getAbsolutePath());
        intent.putExtra("ru.ok.tamtam.extra.SHOW_RECAPTURE", true);
        intent.putExtra("ru.ok.tamtam.extra.FOR_CHAT_BACKGROUND", false);
        pnf.o(cnbVar.A0, new ikb(intent));
        return e5fVar;
    }
}
