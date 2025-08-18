package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.mediatypepicker.MediaTypePickerWidget;

/* loaded from: classes.dex */
public final class mm8 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MediaTypePickerWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mm8(Continuation continuation, MediaTypePickerWidget mediaTypePickerWidget) {
        super(2, continuation);
        this.Y = mediaTypePickerWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        mm8 mm8Var = (mm8) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        mm8Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        mm8 mm8Var = new mm8(continuation, this.Y);
        mm8Var.X = obj;
        return mm8Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        km8 km8Var = (km8) this.X;
        bc7[] bc7VarArr = MediaTypePickerWidget.Y;
        MediaTypePickerWidget mediaTypePickerWidget = this.Y;
        mediaTypePickerWidget.getClass();
        bc7 bc7Var = MediaTypePickerWidget.Y[2];
        tl8 tl8Var = (tl8) mediaTypePickerWidget.o.getValue();
        km8Var.getClass();
        tl8Var.setSelected(gm8.a);
        return e5f.a;
    }
}
