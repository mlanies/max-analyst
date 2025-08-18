package defpackage;

import android.net.Uri;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.dialogs.share.media.ChatMediaDownloadBottomSheet;

/* loaded from: classes.dex */
public final class je2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatMediaDownloadBottomSheet Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public je2(Continuation continuation, ChatMediaDownloadBottomSheet chatMediaDownloadBottomSheet) {
        super(2, continuation);
        this.Y = chatMediaDownloadBottomSheet;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        je2 je2Var = (je2) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        je2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        je2 je2Var = new je2(continuation, this.Y);
        je2Var.X = obj;
        return je2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        kn4 kn4Var = (kn4) this.X;
        boolean z = kn4Var instanceof jn4;
        ChatMediaDownloadBottomSheet chatMediaDownloadBottomSheet = this.Y;
        if (z) {
            chatMediaDownloadBottomSheet.s0(false);
            jn4 jn4Var = (jn4) kn4Var;
            Uri uri = jn4Var.a;
            en4 en4Var = jn4Var.b;
            switch (en4Var.ordinal()) {
                case 0:
                    if (uri != null) {
                        String str = o37.a;
                        o37.c(chatMediaDownloadBottomSheet.getContext(), uri, "video/*");
                        break;
                    }
                    break;
                case 1:
                    chatMediaDownloadBottomSheet.A0(p0c.media_share_dialog_download_video_success, woc.n);
                    break;
                case 2:
                case 4:
                    if (uri != null) {
                        String str2 = o37.a;
                        o37.c(chatMediaDownloadBottomSheet.getContext(), uri, "image/*");
                        break;
                    }
                    break;
                case 3:
                case 5:
                    chatMediaDownloadBottomSheet.A0(en4Var == en4.Z ? p0c.media_share_dialog_download_gif_success : p0c.media_share_dialog_download_photo_success, woc.n);
                    break;
                case 6:
                    if (uri != null) {
                        String str3 = o37.a;
                        o37.c(chatMediaDownloadBottomSheet.getContext(), uri, "*/*");
                        break;
                    }
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } else {
            if (!(kn4Var instanceof in4)) {
                throw new NoWhenBranchMatchedException();
            }
            int i = ((in4) kn4Var).a;
            int i2 = woc.I;
            bc7[] bc7VarArr = ChatMediaDownloadBottomSheet.E0;
            chatMediaDownloadBottomSheet.A0(i, i2);
            chatMediaDownloadBottomSheet.s0(true);
        }
        og4 og4Var = chatMediaDownloadBottomSheet.B0;
        if (og4Var != null) {
            og4Var.a();
        }
        return e5f.a;
    }
}
