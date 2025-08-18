package defpackage;

import android.content.Context;
import android.content.Intent;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.mediatypepicker.MediaTypePickerWidget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import ru.ok.messages.location.ActLocationMap;

/* loaded from: classes.dex */
public final class nm8 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MediaTypePickerWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nm8(Continuation continuation, MediaTypePickerWidget mediaTypePickerWidget) {
        super(2, continuation);
        this.Y = mediaTypePickerWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        nm8 nm8Var = (nm8) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        nm8Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        nm8 nm8Var = new nm8(continuation, this.Y);
        nm8Var.X = obj;
        return nm8Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        wm9 wm9Var = (wm9) this.X;
        boolean zF = tpa.f(wm9Var, ul8.b);
        MediaTypePickerWidget mediaTypePickerWidget = this.Y;
        if (zF) {
            bc7[] bc7VarArr = MediaTypePickerWidget.Y;
            Context context = mediaTypePickerWidget.getContext();
            bc7 bc7Var = MediaTypePickerWidget.Y[0];
            long jLongValue = ((Number) mediaTypePickerWidget.a.a(mediaTypePickerWidget)).longValue();
            int i = ActLocationMap.U0;
            Intent intent = new Intent(context, (Class<?>) ActLocationMap.class);
            intent.putExtra("ru.ok.tamtam.extra.CHAT_ID", jLongValue);
            intent.putExtra("map:DISABLE_LIVE", false);
            intent.putExtra("map:REGULAR_SENDING", true);
            mediaTypePickerWidget.startActivityForResult(intent, 371);
        } else if (tpa.f(wm9Var, vl8.b)) {
            bc7[] bc7VarArr2 = MediaTypePickerWidget.Y;
            mediaTypePickerWidget.getClass();
            bc7[] bc7VarArr3 = BottomSheetWidget.x0;
            lg3 lg3VarE = wg0.e(u8a.H, 6, null);
            lg3VarE.a(new mg3(1, new eqe(u8a.G), 3, false));
            lg3VarE.a(new mg3(2, new eqe(u8a.F), 3, false));
            lg3VarE.a(new mg3(3, new eqe(u8a.E), 1, false));
            ConfirmationBottomSheet confirmationBottomSheetE = lg3VarE.e();
            confirmationBottomSheetE.setTargetController(mediaTypePickerWidget);
            uu3 parentController = mediaTypePickerWidget;
            while (parentController.getParentController() != null) {
                parentController = parentController.getParentController();
            }
            foc focVar = parentController instanceof foc ? (foc) parentController : null;
            znc zncVarT = focVar != null ? focVar.T() : null;
            confirmationBottomSheetE.z0(mediaTypePickerWidget);
            if (zncVarT != null) {
                coc cocVar = new coc(confirmationBottomSheetE, null, null, null, false, -1);
                wg0.l(false, cocVar, true, "BottomSheetWidget");
                zncVarT.G(cocVar);
            }
        } else if (wm9Var instanceof c64) {
            vo2.c.R1((c64) wm9Var);
        }
        return e5f.a;
    }
}
