package id.ac.phbapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.ac.persiapan_uts.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()

        //Simpan data

        data?.add(DataModel(R.drawable.komputer,"D3 Teknik Komputer","Program Studi","teknik komputer ini " +
                "Teknik Komputer adalah disiplin ilmu rekayasa komputasi (Computer Engineering) yang merupakan hasil kombinasi ilmu Teknik Elektro (Electrical Engineering) dengan ilmu Komputer (Computer Science) yang saling terintegrasi."))

        data?.add(DataModel(R.drawable.bidan,"D3 Kebidanan","Program Studi", "Program studi kebidanan " +
                "Jurusan Kebidanan merupakan jurusan yang akan mengajarkan kamu cara menolong persalinan, kamu akan berperan dalam membantu dan memimpin persalinan."))

        data?.add(DataModel(R.drawable.dkv,"D3 DKV","Program Studi", "DKV merupakan " +
                "Desain Komunikasi Visual (DKV) adalah cabang ilmu desain yang mempelajari konsep komunikasi dan ungkapan kreatif, teknik dan media dengan memanfaatkan elemen-elemen visual ataupun rupa untuk menyampaikan pesan untuk tujuan tertentu (tujuan informasi ataupun tujuan persuasi yaitu mempengaruhi perilaku)."))

        data?.add(DataModel(R.drawable.elektro,"D3 Teknik Elektro","Program Studi", "Teknik Elektro ini " +
                "Teknik Elektro (Electrical Engineering) disebut juga Teknik Listrik / Elektronika. Jurusan atau program studi ini adalah bagian dari bidang teknik (engineering) yang mempelajari, mendesain dan mengaplikasikan komponen dan sistem yang memanfaatkan listrik (electricity), elektronika (electronics) dan electromagnetism."))

        data?.add(DataModel(R.drawable.hotel,"D3 Perhotelan","Program Studi", "Perhotelan merupakan " +
                "Jurusan Manajemen Perhotelan adalah sebuah jurusan yang menerapkan dan mengembangkan pengetahuan dan keterampilan di bidang ilmu perhotelan atau hospitality." ))

        data?.add(DataModel(R.drawable.akutansi,"D3 Akuntansi","Program Studi", "Akuntansi merupakan" +
                "Jurusan Akuntansi adalah bidang studi yang mempelajari materi terkait metode pencatatan dan penyusunan laporan keuangan yang berguna membantu pemangku kepentingan dalam proses pengambilan keputusan."))

        data?.add(DataModel(R.drawable.farmasi,"D3 Farmasi","Program Studi", "Farmasi merupakan" +
                "salah satu jurusan kuliah dalam rumpun Ilmu Pengetahuan Alam (IPA) atau saintek di bidang kesehatan. Jurusan farmasi fokus dalam mempelajari obat-obatan. Jurusan ini merupakan gabungan dari ilmu biologi, kimia, dan kesehatan. ... Lulusan farmasi akan mendapatkan gelar Sarjana Farmasi atau S. Farm."))

        data?.add(DataModel(R.drawable.informatika,"D4 Teknik Informatika","Program Studi", "Jurusan Teknik informatika ini " +
                "Teknik informatika merupakan bidang ilmu yang mempelajari teknologi komputer meliputi analisis matematis pengembangan, pengujian, evaluasi perangkat lunak (software), sistem operasi, dan kerja komputer."))

        //Set data to Adapter
        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.nama)
                intent.putExtra("harga", item?.harga)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }
        })
    }
}