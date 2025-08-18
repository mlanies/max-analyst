package ru.ok.android.externcalls.sdk.net;

import defpackage.qf0;
import defpackage.tn9;
import defpackage.xxe;
import defpackage.yxe;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\f\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\rH¦\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\rH¦\u0002¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/net/NetworkConnectionManager;", "", "Lqf0;", "callback", "Le5f;", "registerBadConnectionCallback", "(Lqf0;)V", "unregisterBadConnectionCallback", "Ltn9;", "listener", "addNetworkConnectivityListener", "(Ltn9;)V", "removeNetworkConnectivityListener", "Lyxe;", "plusAssign", "(Lyxe;)V", "minusAssign", "Lxxe;", "getTopology", "()Lxxe;", "topology", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public interface NetworkConnectionManager {
    void addNetworkConnectivityListener(tn9 listener);

    xxe getTopology();

    void minusAssign(yxe listener);

    void plusAssign(yxe listener);

    void registerBadConnectionCallback(qf0 callback);

    void removeNetworkConnectivityListener(tn9 listener);

    void unregisterBadConnectionCallback(qf0 callback);
}
