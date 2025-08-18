package defpackage;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import java.io.File;
import kotlin.coroutines.Continuation;
import ru.ok.messages.views.ActAvatarCrop;

/* loaded from: classes2.dex */
public final class ogb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ vgb Y;
    public final /* synthetic */ Uri Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ogb(vgb vgbVar, Uri uri, Continuation continuation) {
        super(2, continuation);
        this.Y = vgbVar;
        this.Z = uri;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ogb ogbVar = (ogb) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        ogbVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        ogb ogbVar = new ogb(this.Y, this.Z, continuation);
        ogbVar.X = obj;
        return ogbVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object njcVar;
        Uri uri;
        e5f e5fVar = e5f.a;
        od2.a0(obj);
        sx3 sx3Var = (sx3) this.X;
        bc7[] bc7VarArr = vgb.A0;
        vgb vgbVar = this.Y;
        je7 je7Var = vgbVar.Y;
        je7 je7Var2 = vgbVar.Z;
        File fileQ = ((kk5) je7Var.getValue()).q((String) vgbVar.z0.get());
        try {
            if (!fileQ.exists() && (uri = this.Z) != null) {
                s5c.I(((Application) je7Var2.getValue()).getContentResolver().openInputStream(uri), fileQ);
            }
            njcVar = e5fVar;
        } catch (Throwable th) {
            njcVar = new njc(th);
        }
        Throwable thA = pjc.a(njcVar);
        if (thA != null) {
            hm9.p(sx3Var.getClass().getName(), "failed to copy picked image, e:", thA);
            vgbVar.t();
        }
        je7 je7Var3 = vgbVar.c;
        y7d y7dVar = (y7d) je7Var3.getValue();
        String absolutePath = fileQ.getAbsolutePath();
        j47.c0(y7dVar, absolutePath, absolutePath);
        j47.a0((y7d) je7Var3.getValue(), fileQ.getAbsolutePath());
        Intent intent = new Intent((Application) je7Var2.getValue(), (Class<?>) ActAvatarCrop.class);
        intent.putExtra("ru.ok.tamtam.extra.URI", Uri.fromFile(fileQ));
        intent.putExtra("ru.ok.tamtam.extra.FILE_PATH", fileQ.getAbsolutePath());
        intent.putExtra("ru.ok.tamtam.extra.SHOW_RECAPTURE", true);
        intent.putExtra("ru.ok.tamtam.extra.FOR_CHAT_BACKGROUND", false);
        pnf.o(vgbVar.w0, new kfb(intent));
        return e5fVar;
    }
}
