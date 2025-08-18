package defpackage;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import java.io.File;
import kotlin.coroutines.Continuation;
import ru.ok.messages.views.ActAvatarCrop;

/* loaded from: classes2.dex */
public final class pcd extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ add Y;
    public final /* synthetic */ Uri Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pcd(add addVar, Uri uri, Continuation continuation) {
        super(2, continuation);
        this.Y = addVar;
        this.Z = uri;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        pcd pcdVar = (pcd) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        pcdVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        pcd pcdVar = new pcd(this.Y, this.Z, continuation);
        pcdVar.X = obj;
        return pcdVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object njcVar;
        Uri uri;
        e5f e5fVar = e5f.a;
        od2.a0(obj);
        sx3 sx3Var = (sx3) this.X;
        bc7[] bc7VarArr = add.K0;
        add addVar = this.Y;
        je7 je7Var = addVar.u0;
        Application application = addVar.X;
        File fileQ = ((kk5) je7Var.getValue()).q((String) addVar.F0.get());
        try {
            if (!fileQ.exists() && (uri = this.Z) != null) {
                s5c.I(application.getContentResolver().openInputStream(uri), fileQ);
            }
            njcVar = e5fVar;
        } catch (Throwable th) {
            njcVar = new njc(th);
        }
        Throwable thA = pjc.a(njcVar);
        if (thA != null) {
            hm9.p(sx3Var.getClass().getName(), "failed to copy picked image, e:", thA);
            addVar.w();
        }
        z7d z7dVar = ((p7b) addVar.s()).b;
        String absolutePath = fileQ.getAbsolutePath();
        j47.c0(z7dVar, absolutePath, absolutePath);
        j47.a0(((p7b) addVar.s()).b, fileQ.getAbsolutePath());
        Intent intent = new Intent(application, (Class<?>) ActAvatarCrop.class);
        intent.putExtra("ru.ok.tamtam.extra.URI", Uri.fromFile(fileQ));
        intent.putExtra("ru.ok.tamtam.extra.FILE_PATH", fileQ.getAbsolutePath());
        intent.putExtra("ru.ok.tamtam.extra.SHOW_RECAPTURE", true);
        intent.putExtra("ru.ok.tamtam.extra.FOR_CHAT_BACKGROUND", false);
        pnf.o(addVar.z0, new vgd(intent));
        return e5fVar;
    }
}
