package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import one.me.android.externalcallback.ExternalCallbackWidget;
import one.me.calllist.ui.callinfo.CallLinkInfoScreen;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.chats.picker.AbstractPickerScreen;
import one.me.chats.picker.contacts.PickerContactsListWidget;
import one.me.chatscreen.ChatScreen;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.contactlist.ContactListWidget;
import one.me.devmenu.logsviewer.LogsViewerScreen;
import one.me.login.inputphone.InputPhoneScreen;
import one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet;
import one.me.profile.ProfileScreen;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class c3 extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ Object Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ Object s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c3(Object obj, Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.X = i;
        this.Z = obj;
        this.s0 = obj2;
    }

    @Override // defpackage.c66
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        switch (this.X) {
            case 0:
                c3 c3Var = new c3((AbstractPickerScreen) this.s0, (Continuation) obj3, 0);
                c3Var.Y = (Map) obj;
                c3Var.Z = (Map) obj2;
                return c3Var.o(e5f.a);
            case 1:
                c3 c3Var2 = new c3((bc) this.s0, (Continuation) obj3, 1);
                c3Var2.Y = (List) obj;
                c3Var2.Z = (List) obj2;
                return c3Var2.o(e5f.a);
            case 2:
                c3 c3Var3 = new c3((BaseBottomSheetWidget) this.s0, (Continuation) obj3, 2);
                c3Var3.Y = (f6b) obj;
                c3Var3.Z = (fka) obj2;
                e5f e5fVar = e5f.a;
                c3Var3.o(e5fVar);
                return e5fVar;
            case 3:
                c3 c3Var4 = new c3((CallLinkInfoScreen) this.s0, (Continuation) obj3, 3);
                c3Var4.Y = (CoordinatorLayout) obj;
                c3Var4.Z = (fka) obj2;
                e5f e5fVar2 = e5f.a;
                c3Var4.o(e5fVar2);
                return e5fVar2;
            case 4:
                c3 c3Var5 = new c3((CallScreen) this.s0, (Continuation) obj3, 4);
                c3Var5.Y = (nnf) obj;
                c3Var5.Z = (List) obj2;
                e5f e5fVar3 = e5f.a;
                c3Var5.o(e5fVar3);
                return e5fVar3;
            case 5:
                c3 c3Var6 = new c3((el1) this.s0, (Continuation) obj3, 5);
                c3Var6.Y = (to1) obj;
                c3Var6.Z = (la1) obj2;
                return c3Var6.o(e5f.a);
            case 6:
                c3 c3Var7 = new c3((ChatScreen) this.s0, (Continuation) obj3, 6);
                c3Var7.Y = (tzc) obj;
                c3Var7.Z = (yq2) obj2;
                return c3Var7.o(e5f.a);
            case 7:
                c3 c3Var8 = new c3((nx2) this.s0, (Continuation) obj3, 7);
                c3Var8.Y = (mt2) obj;
                c3Var8.Z = (g4f) obj2;
                return c3Var8.o(e5f.a);
            case 8:
                c3 c3Var9 = new c3((h8e) this.Z, (h8e) this.s0, (Continuation) obj3, 8);
                c3Var9.Y = (RecyclerView) obj;
                e5f e5fVar4 = e5f.a;
                c3Var9.o(e5fVar4);
                return e5fVar4;
            case 9:
                c3 c3Var10 = new c3((ContactListWidget) this.s0, (Continuation) obj3, 9);
                c3Var10.Y = (dn3) obj;
                c3Var10.Z = (List) obj2;
                e5f e5fVar5 = e5f.a;
                c3Var10.o(e5fVar5);
                return e5fVar5;
            case 10:
                c3 c3Var11 = new c3((tt3) this.Z, (ImageView) this.s0, (Continuation) obj3, 10);
                c3Var11.Y = (FrameLayout) obj;
                e5f e5fVar6 = e5f.a;
                c3Var11.o(e5fVar6);
                return e5fVar6;
            case 11:
                c3 c3Var12 = new c3((ExternalCallbackWidget) this.s0, (Continuation) obj3, 11);
                c3Var12.Y = (TextView) obj;
                c3Var12.Z = (fka) obj2;
                e5f e5fVar7 = e5f.a;
                c3Var12.o(e5fVar7);
                return e5fVar7;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                c3 c3Var13 = new c3((jx5) this.s0, (Continuation) obj3, 12);
                c3Var13.Y = (List) obj;
                c3Var13.Z = (yv5) obj2;
                return c3Var13.o(e5f.a);
            case 13:
                c3 c3Var14 = new c3((InputPhoneScreen) this.s0, (Continuation) obj3, 13);
                c3Var14.Y = (TextView) obj;
                c3Var14.Z = (fka) obj2;
                e5f e5fVar8 = e5f.a;
                c3Var14.o(e5fVar8);
                return e5fVar8;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                c3 c3Var15 = new c3((Drawable) this.s0, (Continuation) obj3, 14);
                c3Var15.Y = (TextView) obj;
                c3Var15.Z = (fka) obj2;
                e5f e5fVar9 = e5f.a;
                c3Var15.o(e5fVar9);
                return e5fVar9;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                c3 c3Var16 = new c3((EndlessRecyclerView2) this.Z, (LogsViewerScreen) this.s0, (Continuation) obj3, 15);
                c3Var16.Y = (List) obj2;
                e5f e5fVar10 = e5f.a;
                c3Var16.o(e5fVar10);
                return e5fVar10;
            case 16:
                c3 c3Var17 = new c3((Drawable) this.Z, (AppCompatTextView) this.s0, (Continuation) obj3, 16);
                c3Var17.Y = (fka) obj2;
                e5f e5fVar11 = e5f.a;
                c3Var17.o(e5fVar11);
                return e5fVar11;
            case LangUtils.HASH_SEED /* 17 */:
                c3 c3Var18 = new c3((AppCompatTextView) this.Z, (AppCompatTextView) this.s0, (Continuation) obj3, 17);
                c3Var18.Y = (fka) obj2;
                e5f e5fVar12 = e5f.a;
                c3Var18.o(e5fVar12);
                return e5fVar12;
            case 18:
                c3 c3Var19 = new c3((MessageContextMenuBottomSheet) this.s0, (Continuation) obj3, 18);
                c3Var19.Y = (FrameLayout) obj;
                c3Var19.Z = (fka) obj2;
                e5f e5fVar13 = e5f.a;
                c3Var19.o(e5fVar13);
                return e5fVar13;
            case 19:
                c3 c3Var20 = new c3((n59) this.s0, (Continuation) obj3, 19);
                c3Var20.Y = (e52) obj;
                c3Var20.Z = (l29) obj2;
                return c3Var20.o(e5f.a);
            case 20:
                c3 c3Var21 = new c3((aua) this.s0, (Continuation) obj3, 20);
                c3Var21.Y = (bua) obj;
                c3Var21.Z = (bua) obj2;
                e5f e5fVar14 = e5f.a;
                c3Var21.o(e5fVar14);
                return e5fVar14;
            case 21:
                c3 c3Var22 = new c3((eya) this.s0, (Continuation) obj3, 21);
                c3Var22.Y = (mt2) obj;
                c3Var22.Z = (List) obj2;
                return c3Var22.o(e5f.a);
            case 22:
                c3 c3Var23 = new c3((mya) this.s0, (Continuation) obj3, 22);
                c3Var23.Y = (List) obj;
                c3Var23.Z = (yv5) obj2;
                return c3Var23.o(e5f.a);
            case 23:
                c3 c3Var24 = new c3((PickerContactsListWidget) this.s0, (Continuation) obj3, 23);
                c3Var24.Y = (List) obj;
                c3Var24.Z = (List) obj2;
                e5f e5fVar15 = e5f.a;
                c3Var24.o(e5fVar15);
                return e5fVar15;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                c3 c3Var25 = new c3((ProfileChangeLinkScreen) this.s0, (Continuation) obj3, 24);
                c3Var25.Y = (ViewGroup) obj;
                c3Var25.Z = (fka) obj2;
                e5f e5fVar16 = e5f.a;
                c3Var25.o(e5fVar16);
                return e5fVar16;
            case 25:
                c3 c3Var26 = new c3((feb) this.s0, (Continuation) obj3, 25);
                c3Var26.Y = (e52) obj;
                c3Var26.Z = (uj3) obj2;
                return c3Var26.o(e5f.a);
            case 26:
                c3 c3Var27 = new c3((ProfileScreen) this.s0, (Continuation) obj3, 26);
                c3Var27.Y = (View) obj;
                c3Var27.Z = (fka) obj2;
                e5f e5fVar17 = e5f.a;
                c3Var27.o(e5fVar17);
                return e5fVar17;
            case 27:
                c3 c3Var28 = new c3((kcc) this.s0, (Continuation) obj3, 27);
                c3Var28.Y = (yj1) obj;
                c3Var28.Z = (Long) obj2;
                return c3Var28.o(e5f.a);
            case 28:
                c3 c3Var29 = new c3((kcc) this.s0, (Continuation) obj3, 28);
                c3Var29.Y = (pqa) obj;
                c3Var29.Z = (wvc) obj2;
                return c3Var29.o(e5f.a);
            default:
                c3 c3Var30 = new c3((s0d) this.s0, (Continuation) obj3, 29);
                c3Var30.Y = (TextView) obj;
                c3Var30.Z = (fka) obj2;
                e5f e5fVar18 = e5f.a;
                c3Var30.o(e5fVar18);
                return e5fVar18;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0351 A[LOOP:4: B:120:0x034b->B:122:0x0351, LOOP_END] */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c3.o(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c3(Object obj, Continuation continuation, int i) {
        super(3, continuation);
        this.X = i;
        this.s0 = obj;
    }
}
