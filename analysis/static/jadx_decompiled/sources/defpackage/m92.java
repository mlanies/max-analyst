package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import one.me.android.deeplink.LinkInterceptorWidget;
import one.me.android.externalcallback.ExternalCallbackWidget;
import one.me.android.join.JoinChatWidget;
import one.me.chatscreen.ChatScreen;
import one.me.folders.edit.FolderEditScreen;
import one.me.sharedata.ShareDataPickerScreen;
import one.me.stickerssearch.StickersSearchScreen;
import one.me.stickersshowcase.StickersShowcaseScreen;

/* loaded from: classes.dex */
public final /* synthetic */ class m92 implements k64 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Bundle b;

    public /* synthetic */ m92(Bundle bundle, int i) {
        this.a = i;
        this.b = bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.k64
    public final Object a() {
        switch (this.a) {
            case 0:
                return new ChatScreen(this.b);
            case 1:
                return new ChatScreen(this.b);
            case 2:
                return new ExternalCallbackWidget(i24.F("params", this.b));
            case 3:
                return new FolderEditScreen(i24.F("id", this.b));
            case 4:
                return new FolderEditScreen(i24.F("id", this.b));
            case 5:
                Bundle bundle = this.b;
                return new JoinChatWidget(i24.D("id", bundle), i24.F("link", bundle), bundle.getString("title"), i24.A("channel", bundle));
            case 6:
                Parcelable parcelable = this.b.getParcelable("link");
                if (parcelable != null) {
                    return new LinkInterceptorWidget((Uri) parcelable, null, 2, 0 == true ? 1 : 0);
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            case 7:
                return new ShareDataPickerScreen(this.b);
            case 8:
                return new ShareDataPickerScreen(this.b);
            case 9:
                return new StickersSearchScreen(this.b);
            default:
                return new StickersShowcaseScreen(this.b);
        }
    }
}
