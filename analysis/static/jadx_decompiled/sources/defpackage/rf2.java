package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.profile.screens.media.ChatMediaListWidget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

/* loaded from: classes2.dex */
public final class rf2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatMediaListWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf2(Continuation continuation, ChatMediaListWidget chatMediaListWidget) {
        super(2, continuation);
        this.Y = chatMediaListWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        rf2 rf2Var = (rf2) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        rf2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        rf2 rf2Var = new rf2(continuation, this.Y);
        rf2Var.X = obj;
        return rf2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        pg2 pg2Var = (pg2) this.X;
        if (pg2Var instanceof hg2) {
            ckb ckbVar = ckb.c;
            hg2 hg2Var = (hg2) pg2Var;
            long j = hg2Var.b;
            f64 f64VarP1 = ckbVar.P1();
            StringBuilder sbK = au1.k(j, ":attach/viewer?chat_id=", "&attach_id=");
            sbK.append(hg2Var.d);
            sbK.append("&msg_id=");
            sbK.append(hg2Var.c);
            sbK.append("&single=");
            sbK.append(hg2Var.e);
            sbK.append("&desc=true");
            f64VarP1.b(sbK.toString(), null);
        } else if (pg2Var instanceof ig2) {
            ckb ckbVar2 = ckb.c;
            ig2 ig2Var = (ig2) pg2Var;
            Parcelable parcelable = ig2Var.b;
            ckbVar2.getClass();
            Bundle bundleG = dy7.g(new kpa("message", parcelable));
            ckbVar2.P1().b(":attach/fullscreen?attachment_id=" + ig2Var.c + "&single_attach=" + ig2Var.d + "&desc_order=true", bundleG);
        } else {
            boolean z = pg2Var instanceof jg2;
            ChatMediaListWidget chatMediaListWidget = this.Y;
            if (z) {
                hm9.R(chatMediaListWidget.getContext(), ((jg2) pg2Var).b);
            } else if (pg2Var instanceof kg2) {
                ckb ckbVar3 = ckb.c;
                kg2 kg2Var = (kg2) pg2Var;
                long j2 = kg2Var.b;
                f64 f64VarP12 = ckbVar3.P1();
                StringBuilder sbK2 = au1.k(j2, ":chats?id=", "&type=local&message_id=");
                sbK2.append(kg2Var.c);
                f64VarP12.b(sbK2.toString(), null);
            } else if (pg2Var instanceof mg2) {
                hm9.e0(chatMediaListWidget.getContext(), ((mg2) pg2Var).b);
            } else if (pg2Var instanceof fg2) {
                tpa.o(chatMediaListWidget.getContext(), ((fg2) pg2Var).b);
            } else if (pg2Var instanceof lg2) {
                ckb ckbVar4 = ckb.c;
                lg2 lg2Var = (lg2) pg2Var;
                Long l = lg2Var.b;
                List listSingletonList = Collections.singletonList(new Long(lg2Var.c));
                if (l != null) {
                    ckbVar4.P1().b(":chats/forward?messages_ids=" + x53.n0(listSingletonList, ",", null, null, null, 62) + "&attach_id=" + l + "&is_forward_attach=" + lg2Var.d, null);
                } else {
                    ckbVar4.P1().b(":chats/forward?messages_ids=".concat(x53.n0(listSingletonList, ",", null, null, null, 62)), null);
                }
            } else if (pg2Var instanceof gg2) {
                try {
                    chatMediaListWidget.getContext().startActivity(((gg2) pg2Var).b);
                } catch (Exception unused) {
                    gg2 gg2Var = (gg2) pg2Var;
                    gg2Var.b.setDataAndType(gg2Var.c, "*/*");
                    chatMediaListWidget.getContext().startActivity(gg2Var.b);
                }
            } else if (pg2Var instanceof ng2) {
                bc7[] bc7VarArr = BottomSheetWidget.x0;
                ng2 ng2Var = (ng2) pg2Var;
                jqe jqeVar = ng2Var.c;
                xm8 xm8Var = ng2Var.b;
                lg3 lg3VarA = od2.a(jqeVar, dy7.g(new kpa("selected_message_id", new Long(xm8Var.j())), new kpa("selected_attach_id", new Long(xm8Var.i()))), 4);
                lg3VarA.f(ng2Var.d);
                Iterator it = ng2Var.e.iterator();
                while (it.hasNext()) {
                    lg3VarA.a((mg3) it.next());
                }
                ConfirmationBottomSheet confirmationBottomSheetE = lg3VarA.e();
                confirmationBottomSheetE.setTargetController(chatMediaListWidget);
                uu3 parentController = chatMediaListWidget;
                while (parentController.getParentController() != null) {
                    parentController = parentController.getParentController();
                }
                foc focVar = parentController instanceof foc ? (foc) parentController : null;
                znc zncVarT = focVar != null ? focVar.T() : null;
                confirmationBottomSheetE.z0(chatMediaListWidget);
                if (zncVarT != null) {
                    coc cocVar = new coc(confirmationBottomSheetE, null, null, null, false, -1);
                    wg0.l(false, cocVar, true, "BottomSheetWidget");
                    zncVarT.G(cocVar);
                }
            } else {
                if (!(pg2Var instanceof og2)) {
                    throw new NoWhenBranchMatchedException();
                }
                ckb ckbVar5 = ckb.c;
                og2 og2Var = (og2) pg2Var;
                long j3 = og2Var.b;
                ckbVar5.getClass();
                Uri uri = Uri.parse(og2Var.g);
                f64 f64VarP13 = ckbVar5.P1();
                Bundle bundleG2 = dy7.g(new kpa("file_url", uri));
                y7g y7gVar = new y7g(13);
                y7gVar.b = ":dialogs/file-download-warning";
                y7gVar.D(Long.valueOf(j3), "chat_id");
                y7gVar.D(Long.valueOf(og2Var.c), "message_id");
                String str = og2Var.d;
                if (str != null) {
                    y7gVar.D(str, "attach_id");
                }
                y7gVar.D(Long.valueOf(og2Var.e), "file_id");
                y7gVar.D(og2Var.f, "file_name");
                f64VarP13.c(y7gVar.r(), bundleG2);
            }
        }
        return e5f.a;
    }
}
