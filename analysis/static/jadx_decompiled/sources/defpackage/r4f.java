package defpackage;

import android.net.Uri;
import androidx.media3.datasource.UdpDataSource$UdpDataSourceException;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class r4f extends ki0 {
    public final int X;
    public final byte[] Y;
    public final DatagramPacket Z;
    public Uri s0;
    public DatagramSocket t0;
    public MulticastSocket u0;
    public InetAddress v0;
    public boolean w0;
    public int x0;

    public r4f() {
        super(true);
        this.X = 8000;
        byte[] bArr = new byte[2000];
        this.Y = bArr;
        this.Z = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // defpackage.t24
    public final long G(a34 a34Var) throws IOException {
        Uri uri = a34Var.a;
        this.s0 = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.s0.getPort();
        d();
        try {
            this.v0 = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.v0, port);
            if (this.v0.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.u0 = multicastSocket;
                multicastSocket.joinGroup(this.v0);
                this.t0 = this.u0;
            } else {
                this.t0 = new DatagramSocket(inetSocketAddress);
            }
            this.t0.setSoTimeout(this.X);
            this.w0 = true;
            f(a34Var);
            return -1L;
        } catch (IOException e) {
            throw new UdpDataSource$UdpDataSourceException(e, 2001);
        } catch (SecurityException e2) {
            throw new UdpDataSource$UdpDataSourceException(e2, 2006);
        }
    }

    @Override // defpackage.t24
    public final void close() throws IOException {
        this.s0 = null;
        MulticastSocket multicastSocket = this.u0;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.v0;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.u0 = null;
        }
        DatagramSocket datagramSocket = this.t0;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.t0 = null;
        }
        this.v0 = null;
        this.x0 = 0;
        if (this.w0) {
            this.w0 = false;
            c();
        }
    }

    @Override // defpackage.t24
    public final Uri getUri() {
        return this.s0;
    }

    @Override // defpackage.m24
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.x0;
        DatagramPacket datagramPacket = this.Z;
        if (i3 == 0) {
            try {
                DatagramSocket datagramSocket = this.t0;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.x0 = length;
                b(length);
            } catch (SocketTimeoutException e) {
                throw new UdpDataSource$UdpDataSourceException(e, 2002);
            } catch (IOException e2) {
                throw new UdpDataSource$UdpDataSourceException(e2, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i4 = this.x0;
        int iMin = Math.min(i4, i2);
        System.arraycopy(this.Y, length2 - i4, bArr, i, iMin);
        this.x0 -= iMin;
        return iMin;
    }
}
