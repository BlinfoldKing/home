import { Header } from "./components/header";
import "./globals.css";
import "../../public/fonts/MingCute.css";
import { Poppins } from "next/font/google";

import "cal-sans";

export const metadata = {
  title: "blinfoldking.dev",
  description: "random writing by me",
};

const poppins = Poppins({
  subsets: ["latin"],
  weight: "400",
});

export default function RootLayout({
  children,
}: {
  children: React.ReactNode;
}) {
  return (
    <html lang="en">
      <body className={poppins.className}>
        <div className="flex flex-row" style={{ width: "100%" }}>
          <Header />
          {children}
        </div>
      </body>
    </html>
  );
}
