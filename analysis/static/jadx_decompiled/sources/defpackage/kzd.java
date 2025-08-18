package defpackage;

import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.a;
import kotlin.coroutines.Continuation;
import ru.ok.messages.views.ActAvatarCrop;

/* loaded from: classes2.dex */
public final class kzd extends ffe implements a66 {
    public final /* synthetic */ a X;
    public final /* synthetic */ Uri Y;
    public final /* synthetic */ String Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kzd(a aVar, Uri uri, String str, Continuation continuation) {
        super(2, continuation);
        this.X = aVar;
        this.Y = uri;
        this.Z = str;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        kzd kzdVar = (kzd) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        kzdVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new kzd(this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        int i = ActAvatarCrop.d1;
        a aVar = this.X;
        if (aVar.b0() != null) {
            Intent intent = new Intent(aVar.b0(), (Class<?>) ActAvatarCrop.class);
            intent.putExtra("ru.ok.tamtam.extra.URI", this.Y);
            intent.putExtra("ru.ok.tamtam.extra.FILE_PATH", this.Z);
            intent.putExtra("ru.ok.tamtam.extra.SHOW_RECAPTURE", false);
            intent.addFlags(65536);
            intent.putExtra("ru.ok.tamtam.extra.NO_ANIM ", true);
            intent.putExtra("ru.ok.tamtam.extra.FOR_CHAT_BACKGROUND", true);
            aVar.d1(intent, 666, null);
        }
        return e5f.a;
    }
}
