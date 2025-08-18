package defpackage;

import android.content.Intent;
import kotlin.coroutines.Continuation;
import one.me.mediapicker.MediaPickerScreen;
import ru.ok.messages.views.ActAvatarCrop;

/* loaded from: classes2.dex */
public final class oe8 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MediaPickerScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oe8(Continuation continuation, MediaPickerScreen mediaPickerScreen) {
        super(2, continuation);
        this.Y = mediaPickerScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        oe8 oe8Var = (oe8) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        oe8Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        oe8 oe8Var = new oe8(continuation, this.Y);
        oe8Var.X = obj;
        return oe8Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        wm9 wm9Var = (wm9) this.X;
        if (wm9Var instanceof ke8) {
            MediaPickerScreen mediaPickerScreen = this.Y;
            Intent intent = new Intent(mediaPickerScreen.getContext(), (Class<?>) ActAvatarCrop.class);
            ke8 ke8Var = (ke8) wm9Var;
            intent.putExtra("ru.ok.tamtam.extra.URI", ke8Var.b);
            intent.putExtra("ru.ok.tamtam.extra.FILE_PATH", ke8Var.c);
            intent.putExtra("ru.ok.tamtam.extra.SHOW_RECAPTURE", true);
            intent.putExtra("ru.ok.tamtam.extra.FOR_CHAT_BACKGROUND", false);
            mediaPickerScreen.startActivityForResult(intent, 666);
        }
        return e5f.a;
    }
}
