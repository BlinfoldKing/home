import Image from "next/image";

export default function Home() {
  return (
    <main
      className="flex min-h-screen flex-col items-start justify-center"
      style={{ width: "100%" }}
    >
      <Image
        alt="Home"
        src="/hi.png"
        fill={true}
        style={{ objectFit: "cover" }}
      />
      <div
        className="flex flex-col justify-center z-50 p-24 with-gradient-r space-y-2"
        style={{ height: "100vh", width: "100%" }}
      >
        <h1 className="text-4xl">
          blinfoldking
          <span className="nav-item p-2 mgc_VIP_2_fill" />
          dev
        </h1>
        <div>
          <h2 className="text-2xl">About Me</h2>
          <p>Software Engineer. Game Designer. Talkative Introvert.</p>
          <p>Worked on various projects and companies of varied scales.</p>
          <a href="/contact" className="border-dashed border-b-2 text-sky-500">
            Learn More
          </a>
        </div>

        <div>
          <h2 className="text-2xl">Contact</h2>
          <div className="flex justify-start space-x-8">
            <div>
              <h3 className="">email me</h3>
              <strong>hi@blinfoldking.dev</strong>
            </div>
            <div>
              <h3 className="">or find me on social medias</h3>
              <strong>@blinfoldking</strong>
            </div>
          </div>
        </div>
      </div>
    </main>
  );
}
