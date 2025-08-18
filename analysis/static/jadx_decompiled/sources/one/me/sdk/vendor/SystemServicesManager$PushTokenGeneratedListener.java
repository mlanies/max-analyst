package one.me.sdk.vendor;

import androidx.annotation.Keep;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bç\u0080\u0001\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"one/me/sdk/vendor/SystemServicesManager$PushTokenGeneratedListener", "", "", ApiProtocol.KEY_TOKEN, "Le5f;", "onPushTokenGenerated", "(Ljava/lang/String;)V", "vendor_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public interface SystemServicesManager$PushTokenGeneratedListener {
    void onPushTokenGenerated(String token);
}
