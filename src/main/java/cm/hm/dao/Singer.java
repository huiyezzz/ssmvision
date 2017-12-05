package cm.hm.dao;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by HUIYE on 2017/12/5.
 */


public class Singer {

    private String sname;

    private Long songnum;

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Long getSongnum() {
        return songnum;
    }

    @Override
    public String toString() {
        return "Singer{" +
                "sname='" + sname + '\'' +
                ", songnum=" + songnum +
                ", albumnum=" + albumnum +
                ", mvnum=" + mvnum +
                '}';
    }

    public void setSongnum(Long songnum) {
        this.songnum = songnum;
    }

    public Long getAlbumnum() {
        return albumnum;
    }

    public void setAlbumnum(Long albumnum) {
        this.albumnum = albumnum;
    }

    public Long getMvnum() {
        return mvnum;
    }

    public void setMvnum(Long mvnum) {
        this.mvnum = mvnum;
    }

    private Long albumnum;

    private Long mvnum;


}
