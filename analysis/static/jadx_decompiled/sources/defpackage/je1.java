package defpackage;

import android.content.Intent;
import org.apache.http.protocol.HTTP;

/* loaded from: classes.dex */
public final class je1 extends u2 {
    public static final je1 c = new je1(8);

    public final void Z1(String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.setType(HTTP.PLAIN_TEXT_TYPE);
        P1().b(":chats/share", dy7.g(new kpa("oneme:share:data", intent), new kpa("oneme:share:title", str2), new kpa("tag", str3)));
    }
}
