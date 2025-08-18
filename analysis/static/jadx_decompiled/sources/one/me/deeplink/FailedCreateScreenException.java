package one.me.deeplink;

import android.net.Uri;
import android.os.Bundle;
import defpackage.e64;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lone/me/deeplink/FailedCreateScreenException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "deep-link_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class FailedCreateScreenException extends IllegalStateException {
    public FailedCreateScreenException(Uri uri, String str, e64 e64Var, Map map, Bundle bundle, Throwable th) {
        super("Failed when create screen for " + uri.toString() + "! route = " + e64Var + ", screenName = " + str + ", queryParams = " + map + ", bundle = " + bundle, th);
    }
}
